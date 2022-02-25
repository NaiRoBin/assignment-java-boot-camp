package com.javabootcamp.crshop.basket;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private Long userId;
    private Long productId;
    private String productName;
    private Integer amount;
    private Float price;
    private Float sumprice;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getSumprice() {
        return sumprice;
    }

    public void setSumprice(Float sumprice) {
        this.sumprice = sumprice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(Id, basket.Id) && Objects.equals(name, basket.name) && Objects.equals(userId, basket.userId) && Objects.equals(productId, basket.productId) && Objects.equals(productName, basket.productName) && Objects.equals(amount, basket.amount) && Objects.equals(price, basket.price) && Objects.equals(sumprice, basket.sumprice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, userId, productId, productName, amount, price, sumprice);
    }
}
