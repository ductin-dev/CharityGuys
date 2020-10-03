package edu.fud.childrencharity.repository;

import edu.fud.childrencharity.entity.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRespository extends JpaRepository<NotificationEntity, Integer> {}
