package edu.icet.rental.service;

import edu.icet.rental.dto.Massage;

import java.util.List;

public interface MassageService {
    void add(Massage message);

    void delete(Long id);

    List<Massage> getAll();
}
