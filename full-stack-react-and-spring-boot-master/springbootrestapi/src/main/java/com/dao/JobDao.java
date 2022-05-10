package com.dao;

import com.entity.Job;
import com.entity.Jobs;
import com.entity.Registration;

public class JobDao {
private static Jobs list=new Jobs();
	
	
	public static Jobs getAllJobs() {
		return list;
	}
	public static void addJobs(Job job) {
		list.getJobList().add(job);
	}
	
}

