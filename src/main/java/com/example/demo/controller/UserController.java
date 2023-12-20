package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {
	
	private final UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	@GetMapping("/users")
	public List<User> getUSers()
	{
		return userRepository.findAll();
	}
	
}
