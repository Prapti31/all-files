package com.example.pwcspringMVC;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AppService {
	List<Registration> lst=new ArrayList<Registration>();
	public boolean loginValid(Login login) {
		for(Registration r:lst)
		if(login.getUsername().equals(r.getUsername()) && login.getPassword().equals(r.getPassword())) {
			return true;
		}
		return false;
	}
	public void addUser(Registration registration) {
		lst.add(registration);
		//System.out.println(registration.getPassword());
		System.out.println(lst);
	}
	public List<Registration> loadAll(){
		return lst;
	}
	public boolean findUser(String name) {
		for(Registration rs:lst) {
			if(rs.getUsername().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteUser(String name) {
		for(Registration rs:lst) {
			if(rs.getUsername().equals(name)) {
				lst.remove(rs);
				return true;
			}
		}
		return false;
	}
	public boolean updateUser(Registration reg,String name) {
		for(Registration rs:lst) {
			if(rs.getUsername().equals(name)) {
				lst.remove(rs);
				lst.add(reg);
				return true;
			}
		}
		return false;
	}
}

