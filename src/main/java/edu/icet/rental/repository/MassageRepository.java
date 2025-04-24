package edu.icet.rental.repository;

import edu.icet.rental.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MassageRepository extends JpaRepository<MessageEntity,Long> {
}
