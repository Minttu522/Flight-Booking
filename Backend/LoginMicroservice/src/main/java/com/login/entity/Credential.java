package com.login.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cred")
public class Credential {
	
	@Id
    private String userid;
	private String useremail;
	private Integer password;
    
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public Credential(String userid, String useremail, Integer password) {
		super();
		this.userid = userid;
		this.useremail = useremail;
		this.password = password;
	}
	public Credential() {
	
	}
	@Override
	public String toString() {
		return "Credential [userid=" + userid + ", useremail=" + useremail + ", password=" + password + "]";
	}
	
	
	
}
