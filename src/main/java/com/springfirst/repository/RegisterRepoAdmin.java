package com.springfirst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springfirst.model.AdminModel;
@Repository
public interface RegisterRepoAdmin extends JpaRepository<AdminModel, Long>{

}
