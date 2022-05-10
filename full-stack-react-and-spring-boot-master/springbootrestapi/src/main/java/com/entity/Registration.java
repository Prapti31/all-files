package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
@Entity
@Table(name="users")
public class Registration{
	@Id
	@GeneratedValue
	private int uid;
	private String username;
	private String password;
	private String email;
	private String city;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
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
	public Registration(int uid, String username, String password, String email, String city) {
		super();
		this.uid = uid;
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
		return "Registration [uid=" + uid + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", city=" + city + "]";
	}
	
}