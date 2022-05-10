package com.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dao.UserDAO;

import com.entity.Registration;

import java.util.Optional;

@Service
public class AppService {
	
	private UserDAO userDAO;
	List<Registration> lst=new ArrayList<Registration>();
	public void addUser(Registration reg) {
		userDAO.save(reg);
		System.out.println(lst);
	}
	public List<Registration> loadall(){
		List<Registration> lst=(List<Registration>)userDAO.findAll();
		return lst;
	}
	public boolean findUser(int uid) {
		Optional opt=userDAO.findById(uid);
		if(opt.isPresent()) {
			return true;
		}
		return false;
		
	}
	public boolean deleteUser(int id) {
		Optional opt=userDAO.findById(id);
		if(opt.isPresent()) {
			userDAO.deleteById(id);
			return true;
		}
		return false;
	}
	public boolean updateUser(Registration reg,int id) {
		
		Optional opt=userDAO.findById(id);
		if(opt.isPresent()) {
			userDAO.deleteById(id);
			userDAO.save(reg);
			return true;
		}
		return false;
	}
}


