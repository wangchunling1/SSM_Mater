package com.oracle.web.bean;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

public class Admin {
	
	private Integer uid;

	private String userName;
	
	private String password;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Integer uid, String userName, String password) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [uid=" + uid + ", userName=" + userName + ", password=" + password + "]";
	}
	
}
