package com.britomited.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.britomited.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
		
}
