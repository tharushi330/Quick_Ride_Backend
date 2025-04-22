package edu.icet.rental.service;

import edu.icet.rental.dto.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleService {
    Optional<Vehicle> add(Vehicle vehicle);

    void delete(Long id);

    void update(Vehicle vehicle);

    List<Vehicle>  searchByName(String brand);

    List<Vehicle> getAll();
}
