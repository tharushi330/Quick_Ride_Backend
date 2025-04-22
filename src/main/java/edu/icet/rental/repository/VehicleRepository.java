package edu.icet.rental.repository;

import edu.icet.rental.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {
    VehicleEntity findByBrand(String brand);
}
