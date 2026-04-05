package com.example.Project01.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.Project01.entity.Userss;
import com.example.Project01.exception.UserServiceException;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	UserRepo userRepo;

	@Override
	public void loginUser(String userName, String password) {

		if (userRepo.findByUserName(userName).isEmpty()) {

			throw new UserServiceException("Username Not Found ", HttpStatus.NOT_FOUND);

		}

		Userss user = userRepo.findByUserName(userName).get();

		if (user.getPassword().equals(password)) {
			System.out.println("user login successfull");
		} else {
			System.out.println("User Not Found. Login Failed !");
		}
		;
	}

}
