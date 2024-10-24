package com.eCommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCommerce.exception.UserNotFoundException;
import com.eCommerce.model.User;
import com.eCommerce.repositories.OrderRepository;
import com.eCommerce.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	// create new user
	public User createUser(User user) {
		return userRepository.save(user);
	}

	// search all users
	public List<User> getAllUsers() {
		return userRepository.findAll(); // return all users
	}

	//search user by id
	public User getUserById(Long idUser) {
		return userRepository.findById(idUser)
				.orElseThrow(() -> new UserNotFoundException("ID user " + idUser + " not found"));
	}
}
