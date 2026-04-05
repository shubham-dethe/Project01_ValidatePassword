package com.example.Project01.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project01.entity.Userss;
import com.example.Project01.service.UserService;

@RestController
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("user")
	ResponseEntity<String> registerUser(@RequestBody Userss user) {

		userService.addUser(user);

		return new ResponseEntity<String>("User Added", HttpStatus.CREATED);

	}
	
	@GetMapping("users")
	ResponseEntity<String> getAllUser() {
		
		
		return new ResponseEntity (userService.getAllusers(), HttpStatus.OK);
		
	}
	
	

}
