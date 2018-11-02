package com.springfirst.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springfirst.model.RegisterModel;
@Repository
public interface RegisterRepo extends JpaRepository<RegisterModel, Long>  {

	List<RegisterModel> findByUsername(String username);
	
}
