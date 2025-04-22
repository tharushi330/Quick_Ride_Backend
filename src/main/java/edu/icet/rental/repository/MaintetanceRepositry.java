package edu.icet.rental.repository;

import edu.icet.rental.entity.MaintenanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintetanceRepositry extends JpaRepository<MaintenanceEntity,Long> {
}
