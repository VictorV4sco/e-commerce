package com.eCommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eCommerce.model.User;
import com.eCommerce.repositories.projection.UserProjection;

public interface UserRepository extends JpaRepository<User, Long>{

	public UserProjection findByUserName(String userName);
}
