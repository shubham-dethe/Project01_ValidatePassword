package com.example.Project01.service;

import java.util.List;

import com.example.Project01.entity.Userss;

public interface UserService {

	
	void addUser(Userss user);
	
	List<Userss> getAllusers();
}
