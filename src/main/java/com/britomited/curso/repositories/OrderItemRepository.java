package com.britomited.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.britomited.curso.entities.OrderItem;
import com.britomited.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
		
}
