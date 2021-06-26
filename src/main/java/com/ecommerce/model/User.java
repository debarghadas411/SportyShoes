package com.ecommerce.model;

public class User {
	private int userId;
	private String username;
	private String password;
	private String email;
	private String phnno;
	public User(int userId, String username, String password, String email, String phnno) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phnno = phnno;
	}
	public User() {
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}
	public int getUserId() {
		return userId;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getPhnno() {
		return phnno;
	}
	
	
}
