package com.eCommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eCommerce.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
