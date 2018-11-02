package com.springfirst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springfirst.model.AdminModel;
import com.springfirst.model.RegisterModel;
import com.springfirst.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/register")
	public String registerUser(@RequestBody RegisterModel registerModel) {
		
		System.out.println("called-------" + registerModel);
		userService.saveUsers(registerModel);
		
		return "hi";
	}
	@PostMapping("/reg")
	public String registerUser(@RequestBody AdminModel adminModel) {
		
		System.out.println("called-------" + adminModel);
		userService.saveUsersAdmin(adminModel);
		   
		return "admin.....";
	}
}
