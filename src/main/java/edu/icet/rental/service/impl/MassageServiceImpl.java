package edu.icet.rental.service.impl;

import edu.icet.rental.dto.Massage;
import edu.icet.rental.entity.MassageEntity;
import edu.icet.rental.repository.MassageRepository;
import edu.icet.rental.service.MassageService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MassageServiceImpl implements MassageService {
    final MassageRepository repository;
    final ModelMapper mapper;

    @Override
    public void add(Massage message) {
        repository.save(mapper.map(message, MassageEntity.class));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Massage> getAll() {
        List<MassageEntity> entity = repository.findAll();
        List<Massage> list = new ArrayList<>();
        entity.forEach(el ->list.add(mapper.map(el, Massage.class)));
        return list;
    }
}
