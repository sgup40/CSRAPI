package com.csr.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "USER")
public class User {

	private String userName;
	private String password;
	private String userType;
	private Integer userId;
	private Character userStatus;
	
	public User() {
		super();
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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Character getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Character userStatus) {
		this.userStatus = userStatus;
	}

	
	/*@Override
	public String toString(){
		return "hi"; //"user{" 
				//+ "username" + userName +"user type " + userType + "}";
		 
	}*/
	
}