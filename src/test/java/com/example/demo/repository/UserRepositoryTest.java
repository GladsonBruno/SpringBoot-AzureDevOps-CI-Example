package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.vo.UserVO;

@SpringBootTest
class UserRepositoryTest {

	UserRepository userRepository = new UserRepository();
	
	@Test
	void testIfUserOneExists() {
		
		UserVO user = this.userRepository.getById(1);
		
		Assertions.assertNotNull(user);
		
	}
	
	@Test
	void testIfUserElevenNotExists() {
		
		UserVO user = this.userRepository.getById(11);
		
		Assertions.assertNull(user);
		
	}
	
	@Test
	void testGetAllUsers() {
		
		List<UserVO> users = this.userRepository.getAll();
		
		Assertions.assertEquals(10, users.size());
		
	}
	
}
