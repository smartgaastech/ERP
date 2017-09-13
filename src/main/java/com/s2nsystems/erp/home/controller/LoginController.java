package com.s2nsystems.erp.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.s2nsystems.erp.home.entity.User;
import com.s2nsystems.erp.home.service.IUserService;

@Controller
@RequestMapping("login")
public class LoginController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("users")
	public ResponseEntity<List<User>> getAllArticles() {
		List<User> list = userService.getAllUsers();
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
	}
	
}
