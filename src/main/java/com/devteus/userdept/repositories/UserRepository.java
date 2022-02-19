package com.devteus.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devteus.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
