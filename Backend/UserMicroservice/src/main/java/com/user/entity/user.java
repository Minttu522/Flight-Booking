package com.user.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class user {
	
	@Id
	private Integer flightId;
	private String flightsheet;
	private String email;
	private String flightName;
	private  String flightFrom;
	private String flightTo;
	private String date;
	private Double fare;
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
	public String getFlightsheet() {
		return flightsheet;
	}
	public void setFlightsheet(String flightsheet) {
		this.flightsheet = flightsheet;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightFrom() {
		return flightFrom;
	}
	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
	}
	public String getFlightTo() {
		return flightTo;
	}
	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
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
	@Override
	public String toString() {
		return "user [flightId=" + flightId + ", flightsheet=" + flightsheet + ", email=" + email + ", flightName="
				+ flightName + ", flightFrom=" + flightFrom + ", flightTo=" + flightTo + ", date=" + date + ", fare="
				+ fare + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + ", age=" + age
				+ "]";
	}

}
