package edu.icet.rental.service.impl;

import edu.icet.rental.dto.Vehicle;
import edu.icet.rental.entity.VehicleEntity;
import edu.icet.rental.repository.VehicleRepository;
import edu.icet.rental.service.VehicleService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VehicleServiceImpl implements VehicleService {
    private final VehicleRepository repository;
    private final ModelMapper mapper;


    @Override
    public Optional<Vehicle> add(Vehicle vehicle) {
        VehicleEntity entity = mapper.map(vehicle, VehicleEntity.class);
        VehicleEntity savedEntity = repository.save(entity);
        Vehicle savedVehicle = mapper.map(savedEntity, Vehicle.class);
        return Optional.of(savedVehicle);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Vehicle vehicle) {
        VehicleEntity existingEntity = repository.findById(vehicle.getVehicleID())
                .orElseThrow(() -> new EntityNotFoundException("Admin not found"));
        VehicleEntity updatedEntity = mapper.map(vehicle, VehicleEntity.class);
        updatedEntity.setVehicleID(existingEntity.getVehicleID());
        repository.save(updatedEntity);
    }

    @Override
    public List<Vehicle> searchByName(String brand) {
        List<VehicleEntity> entity = (List<VehicleEntity>) repository.findByBrand(brand);
        List<Vehicle> list = new ArrayList<>();
        entity.forEach(entityies -> list.add(mapper.map(entityies,Vehicle.class)));
        return list;
    }

    @Override
    public List<Vehicle> getAll() {
        List<VehicleEntity> entity = repository.findAll();
        List<Vehicle> arrayList = new ArrayList<>();
        entity.forEach(e -> arrayList.add(mapper.map(e, Vehicle.class)));
        return arrayList;
    }
}
