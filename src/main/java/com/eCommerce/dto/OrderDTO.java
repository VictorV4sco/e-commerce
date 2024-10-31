package com.eCommerce.dto;

import java.util.List;

import com.eCommerce.model.Product;
import com.eCommerce.model.User;

public record OrderDTO(
		Long idOrder,
		Boolean status, User user,
		List<Product> product
		){

}
