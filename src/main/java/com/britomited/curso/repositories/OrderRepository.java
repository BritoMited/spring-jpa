package com.britomited.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.britomited.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
		
}
