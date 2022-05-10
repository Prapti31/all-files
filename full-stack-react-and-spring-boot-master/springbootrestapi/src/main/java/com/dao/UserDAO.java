package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Registration;
@Repository
public interface UserDAO extends JpaRepository<Registration,Integer>{

}
