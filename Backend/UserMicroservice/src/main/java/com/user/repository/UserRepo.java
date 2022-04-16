package com.user.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.user;
@Repository
public interface UserRepo extends MongoRepository<user, Integer> {

	public List<user> findByemail(String email);
	public List<user> deleteByemail(String email);
}
