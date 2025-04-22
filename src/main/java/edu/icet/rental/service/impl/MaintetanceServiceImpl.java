package edu.icet.rental.service.impl;

import edu.icet.rental.dto.Maintenance;
import edu.icet.rental.entity.MaintenanceEntity;
import edu.icet.rental.repository.MaintetanceRepositry;
import edu.icet.rental.service.MaintetanceService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MaintetanceServiceImpl implements MaintetanceService {
    private final MaintetanceRepositry repository;
    private final ModelMapper mapper;

    @Override
    public void add(Maintenance maintenance){
        repository.save(mapper.map(maintenance, MaintenanceEntity.class));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Maintenance maintenance) {
        repository.save(mapper.map(maintenance, MaintenanceEntity.class));
    }

    @Override
    public Optional<MaintenanceEntity> searchById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Maintenance> getAll() {
        List<MaintenanceEntity> entity = repository.findAll();
        List<Maintenance> arrayList = new ArrayList<>();
        entity.forEach(e -> arrayList.add(mapper.map(e, Maintenance.class)));
        return arrayList;
    }
}
