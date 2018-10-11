package com.dteja.dao;

import com.dteja.model.UserDetail;

public interface UserDetailDAO {
	boolean registerUser(UserDetail user);
	boolean updateUser(UserDetail user);  //approve or not user after he/she registers/ also if user updates his/her details
}