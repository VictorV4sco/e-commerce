package com.eCommerce.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String category;
	
	@Column
	private Long quantityInStock;
	
	@Column
	private Double price;
	
	public Product() {
	}

	public Product(Long id, String name, String category, Long quantityInStock, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.quantityInStock = quantityInStock;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(Long quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", quantityInStock="
				+ quantityInStock + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, id, name, price, quantityInStock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(quantityInStock, other.quantityInStock);
	}
	
	

}
