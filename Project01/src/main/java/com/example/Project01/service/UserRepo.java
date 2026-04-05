package com.example.Project01.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project01.entity.Userss;

public interface UserRepo extends JpaRepository<Userss, Integer> {
	
	 Optional<Userss> findByUserName(String userName);
	


}
