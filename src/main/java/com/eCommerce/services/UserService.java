package com.eCommerce.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eCommerce.dto.UserDTO;
import com.eCommerce.exception.UserNotFoundException;
import com.eCommerce.mapper.UserMapper;
import com.eCommerce.model.User;
import com.eCommerce.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	// create new user
	public UserDTO createUser(UserDTO userDTO) {
		
	// Converte o DTO para a entidade usando o mapper
	User userEntity = UserMapper.INSTANCE.fromRecord(userDTO);
	
	//Salva a entidade no banco de dados
	User savedUser = userRepository.save(userEntity);
	
	//Converte a entidade salva de volta para DTO e retorna
	return UserMapper.INSTANCE.toRecord(savedUser);
	}

	// search all users
	public List<UserDTO> getAllUsers() {
		
		// Recupera todas as entidades do repositório
		List<User> users = userRepository.findAll();
		
		// Usa o mapper para converter a lista de entidades para DTOs
		return users.stream().map(UserMapper.INSTANCE::userToUserDTO).collect(Collectors.toList());
	}

	// search user by id
	public User getUserById(Long idUser) {
		return userRepository.findById(idUser)
				.orElseThrow(() -> new UserNotFoundException("ID user " + idUser + " not found"));
	}
}

// import org.springframework.beans.BeanUtils;
//public User createUser(UserDTO userDTO) {
//User user = new User();
//BeanUtils.copyProperties(userDTO, user);
//
//
//return userRepository.save(user);
//}
