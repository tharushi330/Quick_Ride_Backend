package edu.icet.rental.service;

import edu.icet.rental.dto.Payment;
import edu.icet.rental.entity.PaymentEntity;

import java.util.List;
import java.util.Optional;

public interface PaymentService {
    void add(Payment payment);

    void delete(Long id);

    void update(Payment payment);

    Optional<PaymentEntity> searchById(Long id);

    List<Payment> getAll();
}
