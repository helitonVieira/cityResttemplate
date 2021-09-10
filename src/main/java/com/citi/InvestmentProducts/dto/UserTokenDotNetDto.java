package com.citi.InvestmentProducts.dto;

public class UserTokenDotNetDto {
	
	private UserDotNetDto user;
	private String token;

	public UserDotNetDto getUser() {
		return user;
	}

	public void setUser(UserDotNetDto user) {
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
