package com.julanih.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julanih.demo.entity.User;
import com.julanih.demo.repository.IUserRepo;

@Service
public class UserService {
	@Autowired
	private IUserRepo userRepo;
	
	public List<User> allUsers() {
		return userRepo.findAll();
	}
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
	public User getUser(Integer id) {
		return userRepo.findById(id).get();
	}
	
	public void deleteUser(Integer id) {
		userRepo.deleteById(id);
	}
}
