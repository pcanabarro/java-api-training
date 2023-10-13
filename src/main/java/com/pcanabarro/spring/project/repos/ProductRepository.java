package com.pcanabarro.spring.project.repos;

import com.pcanabarro.spring.project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
