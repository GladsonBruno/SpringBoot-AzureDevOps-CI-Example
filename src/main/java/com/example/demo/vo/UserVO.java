package com.example.demo.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserVO {

	private int id;
	private String username;
	private String email;

	public UserVO(int id, String username, String email) {
		this.id = id;
		this.username = username;
		this.email = email;
	}
	
}
