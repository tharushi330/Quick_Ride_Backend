package edu.icet.rental.service;

import edu.icet.rental.dto.Review;
import edu.icet.rental.entity.ReviewEntity;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    void add(Review review);

    void delete(Long id);

    void update(Review review);

    Optional<ReviewEntity> searchById(Long id);

    List<Review> getAll();
}
