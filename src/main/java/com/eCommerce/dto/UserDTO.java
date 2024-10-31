package com.eCommerce.dto;

import java.util.List;

import com.eCommerce.model.Order;

public record UserDTO(
		Long idUser, 
		String userName,
		List<Order> orders
		){
}