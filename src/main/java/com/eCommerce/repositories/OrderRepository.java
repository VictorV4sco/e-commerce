package com.eCommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eCommerce.model.Order;

public interface OrderRepository extends JpaRepository <Order, Long>{

}
