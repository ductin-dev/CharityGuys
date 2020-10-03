package edu.fud.childrencharity.repository;

import edu.fud.childrencharity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<UserEntity, Integer> {}
