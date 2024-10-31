package com.eCommerce.dto;

import com.eCommerce.model.Order;

public record ProductDTO (
		Long idProduct,
		String name,
		String category,
		Long quantityInStock,
		Double price,
		Order order
		){

}
