package com.usk.training.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserDefinedException {

	public static void main(String[] args) throws IOException, UserNotFoundException {
		User user1 = new User(1, "user1");
		User user2 = new User(2, "user2");
		
		User[] users = {user1, user2};
		System.out.println("Please enter userId");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userId = br.readLine();
		if(Integer.valueOf(userId) == 1) {
			System.out.println(user1.getName());
		}else {
			throw new UserNotFoundException("User not found.");
		}
	}

}

class UserNotFoundException extends Exception {

	String message = null;

	UserNotFoundException(String message) {
		this.message = message;
	}
}

class User {

	User(int userId, String name) {
		this.userId = userId;
		this.name = name;
	}

	private int userId;

	private String name;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}