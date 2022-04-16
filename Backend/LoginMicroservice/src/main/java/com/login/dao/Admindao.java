package com.login.dao;

import com.login.entity.Admin;

public class Admindao {

	private String adminemail;
	private Integer password;
	
	public String getAdminemail() {
		return adminemail;
	}

	public void setAdminemail(String adminemail) {
		this.adminemail = adminemail;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public Admin getobject(Admindao admin) {
		Admin ad = new Admin();
		ad.setAdminemail(admin.getAdminemail()); // userid is email of admin
		ad.setPassword(admin.getPassword()); // password of admin
		return ad;
	}
}
