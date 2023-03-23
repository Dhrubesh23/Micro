package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	//fake user list
	
	List<User> list = List.of(
			new User(3329, "Dhrubesh Mahata", "700186"),
			new User(3330, "Priyanka Mahata", "700187"),
			new User(3331, "Asish Kumar", "700188")
			);
	
	
	@Override
	public User getUser(Integer id) {
		
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
				
	}
	
	
}
