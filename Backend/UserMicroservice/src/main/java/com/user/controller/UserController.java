package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.dao.UserDao;
import com.user.entity.user;
import com.user.service.UserService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public String adduserDetails(@RequestBody UserDao userdao) {
		user entity = new user();
		entity = userdao.getobject(userdao);
		userService.adduserdetails(entity);
		return "user details added successfully";
	}
	
	@GetMapping("/userdetails/{email}")
	public List<user> showuserdetails(@PathVariable("email") String email) {
		return userService.showuserdetailsbyId(email);
	}
	
	@DeleteMapping("/deleteUser/{email}")
	public void deleteUser(@PathVariable("email") String email) {
		userService.deleteUserDetails(email);
	}
}
