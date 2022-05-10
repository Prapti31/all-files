package com.controller;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.AppService;

import java.util.List;

@RestController
@RequestMapping("/mainapp")
public class AppController {
	@Autowired
	private AppService service;
	
	@GetMapping("/loaduserfromapp")
	public String loadUsers() {
		return service.callApp();
	}
	@GetMapping("/loaduserwithpara/{loc}")
	public String loadUsersWithPara(@PathVariable("loc")String loc) {
		return service.callAppWithPara(loc);
	}
	@GetMapping("/loaddept")
	public String loaddept() {
		return service.callDept();
	}
	@GetMapping("/loaddeptfromproject/{projectname}")
	public String loaddeptwithpara(@PathVariable("projectname")String projectname) {
		return service.callDeptWithPara(projectname);
	}
	
}
