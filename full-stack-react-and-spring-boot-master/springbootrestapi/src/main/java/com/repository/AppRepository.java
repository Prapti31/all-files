package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Job;

@Repository
public interface AppRepository extends JpaRepository<Job, Integer>{
	public Job findById(int id);
}

