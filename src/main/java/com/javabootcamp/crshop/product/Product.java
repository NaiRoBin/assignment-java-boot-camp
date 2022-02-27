package com.javabootcamp.crshop.product;

import javax.persistence.*;

@Entity
public class Product{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String urlImg;
	private Integer quantity;
	private Float price;
	private String description;

	public Product(String name, Integer quantity, Float price, String description) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
	}

	public Product() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrlImg() {
		return urlImg;
	}

	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Product product = (Product) o;

		if (id != null ? !id.equals(product.id) : product.id != null) return false;
		if (name != null ? !name.equals(product.name) : product.name != null) return false;
		if (urlImg != null ? !urlImg.equals(product.urlImg) : product.urlImg != null) return false;
		if (quantity != null ? !quantity.equals(product.quantity) : product.quantity != null) return false;
		if (price != null ? !price.equals(product.price) : product.price != null) return false;
		return description != null ? description.equals(product.description) : product.description == null;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (urlImg != null ? urlImg.hashCode() : 0);
		result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
		result = 31 * result + (price != null ? price.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		return result;
	}
}
