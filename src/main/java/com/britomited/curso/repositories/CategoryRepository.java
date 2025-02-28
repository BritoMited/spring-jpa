package com.britomited.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.britomited.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
		
}
