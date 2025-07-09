package com.example.demo_inventory.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private int quantity;
    private double price;

    // Constructors
    public Product() {}
    
    public Product(String name, String category, int quantity, double price) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    // (generate using IDE or write manually)
    public Long getId()
    {
    	return id;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setId(Long id)
    {
    	this.id = id;
    }
    public void setName(String name)
    {
    	this.name = name;
    }
    public void setCategory(String category)
    {
    	this.category = category;
    }
    public void setQuantity(int quantity)
    {
    	this.quantity = quantity;
    }
    public void setPrice(double price)
    {
    	this.price = price;
    }
}
