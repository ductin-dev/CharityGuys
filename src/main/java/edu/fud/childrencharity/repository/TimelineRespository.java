package edu.fud.childrencharity.repository;

import edu.fud.childrencharity.entity.TimelineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimelineRespository extends JpaRepository<TimelineEntity, Integer> {}
