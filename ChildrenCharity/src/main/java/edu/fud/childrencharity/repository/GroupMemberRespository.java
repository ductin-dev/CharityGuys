package edu.fud.childrencharity.repository;

import edu.fud.childrencharity.entity.GroupMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupMemberRespository extends JpaRepository<GroupMemberEntity, Integer> {}
