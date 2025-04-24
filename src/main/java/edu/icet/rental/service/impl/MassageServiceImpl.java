package edu.icet.rental.service.impl;

import edu.icet.rental.dto.Message;
import edu.icet.rental.entity.MessageEntity;
import edu.icet.rental.repository.MassageRepository;
import edu.icet.rental.service.MassageService;
import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Configuration
@PropertySource("classpath:application.properties")
public class MassageServiceImpl implements MassageService {
    final MassageRepository repository;
    final ModelMapper mapper;

    @Autowired
    private JavaMailSender mailSender;

    @Value("${app.mail.receiver}")
    private String receiverEmail;

    @Override
    public void add(Message message) {
        repository.save(mapper.map(message, MessageEntity.class));

        try {
            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setTo(receiverEmail);
            mailMessage.setSubject("New Contact Message from " + message.getName());
            mailMessage.setText(
                    "Name: " + message.getName() + "\n" +
                            "Email: " + message.getEmail() + "\n" +
                            "Phone: " + message.getPhone() + "\n\n" +
                            "Message:\n" + message.getMessage()
            );
            mailSender.send(mailMessage);
            System.out.println("Email sent successfully");
        } catch (Exception e) {
            System.err.println("Error sending email: " + e.getMessage());
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Message> getAll() {
        List<MessageEntity> entity = repository.findAll();
        List<Message> list = new ArrayList<>();
        entity.forEach(el ->list.add(mapper.map(el, Message.class)));
        return list;
    }
}
