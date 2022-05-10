package com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Job;
import com.entity.Registration;
import com.entity.Users;

@Repository

public interface UserRepository extends JpaRepository<Registration,Integer>{
	public Optional<Registration> findById(int id);

	//public Registration save(Registration user);
}

