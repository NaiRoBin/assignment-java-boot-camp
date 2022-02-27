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

        if (Id != null ? !Id.equals(basket.Id) : basket.Id != null) return false;
        if (name != null ? !name.equals(basket.name) : basket.name != null) return false;
        if (userId != null ? !userId.equals(basket.userId) : basket.userId != null) return false;
        if (productId != null ? !productId.equals(basket.productId) : basket.productId != null) return false;
        if (productName != null ? !productName.equals(basket.productName) : basket.productName != null) return false;
        if (amount != null ? !amount.equals(basket.amount) : basket.amount != null) return false;
        if (price != null ? !price.equals(basket.price) : basket.price != null) return false;
        return sumprice != null ? sumprice.equals(basket.sumprice) : basket.sumprice == null;
    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (sumprice != null ? sumprice.hashCode() : 0);
        return result;
    }
}
