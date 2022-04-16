package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.user;
import com.user.repository.UserRepo;
@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public void adduserdetails(user user) {
		userRepo.save(user);
	}
	
	public List<user> showuserdetailsbyId (String email) {
		return userRepo.findByemail(email);
	}
	
	public void deleteUserDetails(String email) {
		 userRepo.deleteByemail(email);
	}
	
}
