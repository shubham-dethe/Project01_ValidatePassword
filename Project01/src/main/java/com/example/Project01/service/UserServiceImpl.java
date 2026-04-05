package com.example.Project01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.Project01.entity.Userss;
import com.example.Project01.exception.UserServiceException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Override
	public void addUser(Userss user) {
		if (userRepo.findByUserName(user.getUserName()).isPresent()) {

			throw new UserServiceException("UserName alredy exist ", HttpStatus.CONFLICT);

		} else {

			userRepo.save(user);
		}

	}

	@Override
	public List<Userss> getAllusers() {

		return userRepo.findAll();

	}

}
