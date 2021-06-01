package day5.entities.concerets;

import day5.entities.abstracts.Login;

public class UserLogin implements Login{

	private String email;
	private String password;
	
	public UserLogin() {
		
	}
	
	public UserLogin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
}
