package com.ingpets.petpeers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ingpets.petpeers.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{


}
