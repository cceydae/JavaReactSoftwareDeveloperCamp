package day5;

import day5.Google.GoogleAdapters;
import day5.business.concretes.AuthManager;
import day5.business.concretes.UserManager;
import day5.dataAccess.concretes.HibernateUserDao;
import day5.entities.concerets.User;
import day5.entities.concerets.UserLogin;

public class Main {

	public static void main(String[] args) {
		User user = new User(1,"Ceyda","Eser","ceydae.1040@gmail.com","123456789",true);
		UserManager userManager=new UserManager(new HibernateUserDao(), new GoogleAdapters());
		userManager.add(user);
		
		AuthManager authManager = new AuthManager(new UserManager(new HibernateUserDao(),new GoogleAdapters()));
		userManager.getAll();
		
		System.out.println("--------");
		
		UserLogin userLogin=new UserLogin();
		userLogin.setEmail("ceydae@hotmail.com");
		userLogin.setPassword("123456789");
		authManager.login(userLogin);
		
		UserLogin userLogin2=new UserLogin();
		userLogin2.setEmail("engindemirog");
		userLogin2.setPassword("123");
		authManager.login(userLogin2);
		
		System.out.println("---------");
		
		
		
	}

}
