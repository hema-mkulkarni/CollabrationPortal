package com.dteja.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dteja.model.UserDetail;

@Repository("userDetailDAO")
@Transactional
public class UserDetailDAOImpl implements UserDetailDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean registerUser(UserDetail user) {
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	@Override
	public boolean updateUser(UserDetail user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}