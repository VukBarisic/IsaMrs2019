package com.smv.AirSpace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smv.AirSpace.model.User;
import com.smv.AirSpace.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public boolean saveAdmin(User user) {
		try {
			userRepository.save(user);
		} catch (Exception e) {
			return false;
		}
		System.out.println("yes");
		return true;
		
	}

}
