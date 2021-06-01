package day5.business.concretes;

import day5.business.abstracts.AuthService;
import day5.business.abstracts.UserService;
import day5.core.Regex;
import day5.entities.concerets.User;
import day5.entities.concerets.UserLogin;

public class AuthManager implements AuthService {

	private UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	
	public boolean userInTheSystem(String email){
		if(userService.getByEmail(email) != null) {
			System.out.println("User exists in the system");
			return false;
		}return true;
	}
	
	public boolean loginCheck(UserLogin userLogin) {
		if(!userLogin.getEmail().isEmpty() &&
				!userLogin.getPassword().isEmpty()) {
			return true;
		}System.out.println("Please fill in the required fields!");
		return false;
	}
	
	
	public boolean userCheck(User user) {
		if(user!=null && user.getFirstName().isEmpty() && user.getLastName().isEmpty() 
				&& user.getEmail().isEmpty() && user.getPassword().isEmpty()) {
			return true;
		}System.out.println("Please fill in the required fields!");
		return false;
		
	}
	
	public boolean passwordCheck(String password) {
		if(password.length() < 6) {
			System.out.println("User password must contain at least 6 character!");
			return false;
		}
		return true;
	}
	
	
	
	@Override
	public void register(User user) {
		if(userCheck(user) && userEmail(user.getEmail()) && passwordCheck(user.getPassword()) &&
				Regex.emailValidate(user.getEmail())) {
			userService.add(user);
			System.out.println("Register successful");
		}else {
			System.out.println("Registered is failed.");
		}
		
	}

	@Override
	public void login(UserLogin userLogin) {
		User user=userService.getByEmail(userLogin.getEmail());
		
		if(user!=null && user.getPassword().equals(userLogin.getPassword()) && loginCheck(userLogin)){
			System.out.println("Login successful");
		} else {
			System.out.println("Login is failed");
		}
				
	}

	@Override
	public boolean userEmail(String email) {
		if(userService.getByEmail(email)!=null) {
			System.out.println("User exists in the system");
			return false;
		}
		return true;
	}
}
