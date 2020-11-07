package edu.fud.childrencharity.repository;

import edu.fud.childrencharity.entity.DonationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRespository extends JpaRepository<DonationEntity, Integer> {}
