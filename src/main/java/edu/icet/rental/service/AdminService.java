package edu.icet.rental.service;

import edu.icet.rental.dto.Admin;
import edu.icet.rental.entity.AdminEntity;

import java.util.List;

public interface AdminService {
    AdminEntity add(Admin admin);

    void delete(Long id);

    void update(Admin admin);

    Admin searchById(Long id);

    List<Admin> getAll();
}
