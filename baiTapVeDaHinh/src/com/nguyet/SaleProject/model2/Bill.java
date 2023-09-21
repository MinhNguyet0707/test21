package com.nguyet.SaleProject.model2;

import java.math.BigDecimal;
import java.util.Date;

public class Bill {
    private int id;
    private int quantity;
    private BigDecimal price;
    private int productId;
    private Date buyDate;

    public Bill(int id, int quantity, BigDecimal price, int productId, Date buyDate) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.productId = productId;
        this.buyDate = buyDate;
    }

    public Bill(int quantity, BigDecimal price, int productId) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }
}
