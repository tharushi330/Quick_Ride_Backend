package edu.icet.rental.service;

import edu.icet.rental.dto.Booking;
import edu.icet.rental.entity.BookingEntity;

import java.util.List;
import java.util.Optional;

public interface BookingService {
    void add(Booking booking);

    void delete(Long id);

    void update(Booking booking);

    Optional<BookingEntity> searchById(Long id);

    List<Booking> getAll();
}
