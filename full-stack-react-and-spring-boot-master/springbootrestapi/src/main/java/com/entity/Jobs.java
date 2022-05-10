package com.entity;

import java.util.ArrayList;
import java.util.List;

public class Jobs {
	private List<Job> jobList;
	
	public List<Job> getJobList(){
		if(jobList==null) {
			jobList=new ArrayList<Job>();
		}
		return jobList;
	}
	public void setJobList(List<Job> jobList) {
		this.jobList=jobList;
	}
}
