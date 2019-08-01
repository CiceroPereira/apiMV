package com.example.mvtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvtest.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findById(long id);

}
