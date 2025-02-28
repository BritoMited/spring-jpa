package com.britomited.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.britomited.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
		
}
