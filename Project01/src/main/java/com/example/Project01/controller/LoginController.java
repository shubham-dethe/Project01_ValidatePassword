package com.example.Project01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project01.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;

	@PostMapping("login/{userName}/{password}")
	ResponseEntity loginUser(@PathVariable String userName, @PathVariable String password) {

		loginService.loginUser(userName, password);

		return new ResponseEntity(HttpStatus.OK);

	}

}
