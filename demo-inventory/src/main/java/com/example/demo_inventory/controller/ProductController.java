package com.example.demo_inventory.controller;

import com.example.demo_inventory.model.Product;
import com.example.demo_inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAll();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.add(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return service.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/lowstock")
    public List<Product> getLowStockProducts() {
        return service.getLowStock();
    }

    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam String query) {
        return service.searchByName(query);
    }
}
