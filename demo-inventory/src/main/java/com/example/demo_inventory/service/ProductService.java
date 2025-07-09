package com.example.demo_inventory.service;

import com.example.demo_inventory.model.Product;
import com.example.demo_inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product add(Product product) {
        return productRepository.save(product);
    }

    public Product update(Long id, Product updatedProduct) {
        updatedProduct.setId(id);
        return productRepository.save(updatedProduct);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public List<Product> getLowStock() {
        return productRepository.findByQuantityLessThan(5);
    }

    public List<Product> searchByName(String query) {
        return productRepository.findByNameContainingIgnoreCase(query);
    }
}
