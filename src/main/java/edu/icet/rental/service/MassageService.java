package edu.icet.rental.service;

import edu.icet.rental.dto.Message;

import java.util.List;

public interface MassageService {
    void add(Message message);

    void delete(Long id);

    List<Message> getAll();
}
