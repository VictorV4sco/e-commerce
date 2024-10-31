package com.eCommerce.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.eCommerce.dto.UserDTO;
import com.eCommerce.model.User;

@Mapper
public interface UserMapper {
	
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	//Não uso @Mapping pois os nomes no DTO e na entity são os mesmos
	UserDTO userToUserDTO(User user);
	
	User fromRecord(UserDTO record);
	
	@InheritInverseConfiguration // Informa ao MapStruct que a configuração de mapeamento inverso (de CustomerEntity para CustomerDto) deve ser herdada do método fromRecord, invertendo automaticamente o mapeamento.
	UserDTO toRecord(User entity);
	}
