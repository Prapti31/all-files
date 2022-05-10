package com.entity;

public class admin {
private String username;	
	private String password;
	private String email;
	private String department;
	private String postJob;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPostJob() {
		return postJob;
	}
	public void setPostJob(String postJob) {
		this.postJob = postJob;
	}
	public admin(String username, String password, String email, String department, String postJob) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.department = department;
		this.postJob = postJob;
	}
	public admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "admin [username=" + username + ", password=" + password + ", email=" + email + ", department="
				+ department + ", postJob=" + postJob + "]";
	}
	
}
