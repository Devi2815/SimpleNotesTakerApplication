package com.app.simplenotes.services;

import com.app.simplenotes.entity.User;
import com.app.simplenotes.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private userRepo repo;

	@Override
	public void registerUser(User user) {
		repo.save(user);
	}
}
