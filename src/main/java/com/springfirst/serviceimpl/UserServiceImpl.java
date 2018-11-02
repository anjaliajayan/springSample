package com.springfirst.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springfirst.model.AdminModel;
import com.springfirst.model.RegisterModel;
import com.springfirst.repository.RegisterRepo;
import com.springfirst.repository.RegisterRepoAdmin;
import com.springfirst.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private RegisterRepo registerRepo;
	@Autowired
	private RegisterRepoAdmin registerRepoAdmin;
	@Override
	public void saveUsers(RegisterModel registerModel) {
		//
		
		registerRepo.save(registerModel);
		
		
		
		
		
		
		
		
		
	}
	@Override
	public void saveUsersAdmin(AdminModel adminModel) {
		registerRepoAdmin.save(adminModel);
		
	}

}
