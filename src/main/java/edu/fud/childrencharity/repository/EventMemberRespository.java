package edu.fud.childrencharity.repository;

import edu.fud.childrencharity.entity.EventMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventMemberRespository extends JpaRepository<EventMemberEntity, Integer> {}
