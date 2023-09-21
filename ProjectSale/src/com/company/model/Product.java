package com.company.model;

import java.math.BigDecimal;

public class Product {
    private int id;
    private String name;
    private double quantity;
    private BigDecimal price;
    private int category_id;

    public Product() {
    }

    public Product(int id, String name, double quatity, BigDecimal price, int category_id) {
    }

    public Product(String name, int quantity, BigDecimal price, int categoryId) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", category_id=" + category_id +
                '}';
    }
}
