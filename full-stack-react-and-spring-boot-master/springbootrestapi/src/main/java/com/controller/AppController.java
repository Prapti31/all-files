package com.controller;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.AppService;
import com.dao.JobDao;
import com.dao.UserDAO;
import com.entity.Job;
import com.entity.Jobs;
import com.entity.Login;
import com.entity.Registration;
import com.entity.Users;
import com.repository.AppRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mainapp")
public class AppController {
	@Autowired
	public AppService service;
	@GetMapping("/loaduser")
	public List <Registration> sayHello(){
		List<Registration> lst=service.loadall();
		return lst;
	}
	@PostMapping("/adduser")
	public String register(@RequestBody Registration reg) {
		service.addUser(reg);
		return "User added";
	}
	@GetMapping("/findUser/{uid}")
	public String findUser(@PathVariable("uid")int uid) {
		if(service.findUser(uid)) {
			return uid+" found";
		}
		return uid+" not found";
	}
	@DeleteMapping("/deleteUser/{uid}")
	public String deleteUser(@PathVariable("uid")int uid) {
		if(service.deleteUser(uid)) {
			return uid+" deleted";
		}
		return uid+" not deleted";
	}
	@PutMapping("/updateUser/{uid}")
	public String updateUser(@RequestBody Registration reg, @PathVariable("uid") int uid) {
		if(service.updateUser(reg, uid))
			return uid+" updated";
		else 
			return uid+" not updated";
		
	}
	
}