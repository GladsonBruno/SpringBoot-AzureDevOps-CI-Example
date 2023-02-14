package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.vo.UserVO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserRepository {

	private ArrayList<UserVO> generateUsers() {
		
		ArrayList<UserVO> users = new ArrayList<UserVO>();
		
		for(int i = 0; i < 10; i++) {
			
			int userID = i + 1;
			String username = String.format("Usuário %s", userID);
			String email = String.format("usuario-%s@gmail.com", userID);
			
			UserVO user = new UserVO(userID, username, email);
			
			users.add(user);
			
		}
		
		return users;
		
	}
	
	public ArrayList<UserVO> getAll() {
		
		ArrayList<UserVO> users = this.generateUsers();
		return users;
		
	}
	
	public UserVO getById(int id) {
		
		ArrayList<UserVO> users = this.generateUsers();
		
		List<UserVO> result = users.stream().filter(user -> user.getId() == id).collect(Collectors.toList());
		
		if (result.size() > 0) {
			return result.get(0);
		} else {
			return null;
		}
		
	}
	
}
