package com.example.demo_inventory.repository;

import com.example.demo_inventory.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByQuantityLessThan(int qty);
    List<Product> findByNameContainingIgnoreCase(String keyword);
}
