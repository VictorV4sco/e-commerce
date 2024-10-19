package com.eCommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eCommerce.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
