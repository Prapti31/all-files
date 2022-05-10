package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.dialect.MySQL55Dialect;
import org.hibernate.dialect.MySQL5Dialect;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;



@Entity
@Table(name = "jobs")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Job {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String job_name;
	private String experience;
	private String location;
	private int salary;
	private String description;
	private String companyName;
	private String logo;
	public long getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getJob_name() {
		return job_name;
	}
	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Job(int id, String job_name, String experience, String location, int salary, String description,
			String companyName, String logo) {
		super();
		Id = id;
		this.job_name = job_name;
		this.experience = experience;
		this.location = location;
		this.salary = salary;
		this.description = description;
		this.companyName = companyName;
		this.logo = logo;
	}
	@Override
	public String toString() {
		return "Job [Id=" + Id + ", job_name=" + job_name + ", experience=" + experience + ", location=" + location
				+ ", salary=" + salary + ", description=" + description + ", companyName=" + companyName + ", logo="
				+ logo + "]";
	}
	
	
}
