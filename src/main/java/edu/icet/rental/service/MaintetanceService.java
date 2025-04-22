package edu.icet.rental.service;

import edu.icet.rental.dto.Maintenance;
import edu.icet.rental.entity.MaintenanceEntity;

import java.util.List;
import java.util.Optional;

public interface MaintetanceService {
    void add(Maintenance maintenance);

    void delete(Long id);

    void update(Maintenance maintenance);

    Optional<MaintenanceEntity> searchById(Long id);

    List<Maintenance> getAll();
}
