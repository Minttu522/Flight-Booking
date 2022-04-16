package com.booking.dao;

import java.io.File;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MappedDocument;
public class UserDao {
	
	@Id
	private Integer flightId;
	private String firstname;
	private String lastname;
	private String gender;
	private Integer age;
	
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}


}
