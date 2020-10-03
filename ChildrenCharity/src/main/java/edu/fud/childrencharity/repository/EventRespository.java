package edu.fud.childrencharity.repository;

import edu.fud.childrencharity.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRespository extends JpaRepository<EventEntity, Integer> {}
