package com.entity;

import java.util.ArrayList;
import java.util.List;

public class Users {
	private List<Registration> userList;
	public List<Registration> getUserList(){
		if(userList==null) {
			userList=new ArrayList<Registration>();
		}
		return userList;
	}
	public void setUserList(List<Registration> userList) {
		this.userList=userList;
	}
}
