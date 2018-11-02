package com.springfirst.service;

import com.springfirst.model.AdminModel;
import com.springfirst.model.RegisterModel;

public interface UserService {

	void saveUsers(RegisterModel registerModel);
	void saveUsersAdmin(AdminModel adminModel);

}
