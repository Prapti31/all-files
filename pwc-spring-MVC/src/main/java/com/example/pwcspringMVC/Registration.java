package com.example.pwcspringMVC;

public class Registration {
	private String username;
	private String password;
	private String email;
	private String city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Registration(String username, String password, String email, String city) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.city = city;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Registration [username=" + username + ", password=" + password + ", email=" + email + ", city=" + city
				+ "]";
	}
	
}
