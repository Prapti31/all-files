package com.service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

@Service
public class AppService {
	@Autowired
	RestTemplate restTemplate;
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	public String callApp() {
		String response=restTemplate.exchange("http://localhost:8050/myemp/loademp", 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<String>() {}).getBody();
		return response;
	}
	public String callAppWithPara(String loc) {
		String response=restTemplate.exchange("http://emp-service/loademp/{loc}", 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<String>() {},loc).getBody();
		return response;
	}
	public String callDept() {
		String response=restTemplate.exchange("http://emp-service/loaddept", 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<String>() {}).getBody();
		return response;
	}
	public String callDeptWithPara(String projectname) {
		String response=restTemplate.exchange("http://emp-service/loaddept/{projectname}", 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<String>() {},projectname).getBody();
		return response;
	}
}