package edu.icet.rental.service.impl;

import edu.icet.rental.dto.Payment;
import edu.icet.rental.entity.PaymentEntity;
import edu.icet.rental.repository.PaymentRepository;
import edu.icet.rental.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository repository;
    private final ModelMapper mapper;

    @Override
    public void add(Payment payment){
        repository.save(mapper.map(payment, PaymentEntity.class));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Payment payment) {
        repository.save(mapper.map(payment, PaymentEntity.class));
    }

    @Override
    public Optional<PaymentEntity> searchById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Payment> getAll() {
        List<PaymentEntity> entity = repository.findAll();
        List<Payment> arrayList = new ArrayList<>();
        entity.forEach(e -> arrayList.add(mapper.map(e, Payment.class)));
        return arrayList;
    }
}
