package com.javabootcamp.crshop.users;


public class UserResponse {
	private String message;

	public UserResponse(){
	}

	public  UserResponse(String message) {this.message = message;}

	public String getMessage(){return message;}
	public void setMessage(){this.message = message;}
}
