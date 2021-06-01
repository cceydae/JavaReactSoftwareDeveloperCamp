package day5.business.concretes;

import java.util.List;

import day5.business.abstracts.UserService;
import day5.core.EmailService;
import day5.dataAccess.abstracts.UserDao;
import day5.entities.concerets.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private EmailService emailService;
	
	

	public UserManager(UserDao userDao, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
	}

	public boolean nameCheck(User user) {
		if (user.getFirstName().length() < 2 && user.getLastName().length() < 2) {
			System.out.println("First name must be at least two characters!");
			System.out.println("Last name must be at least two characters!");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void add(User user) {
		var result = nameCheck(user);
		if(result !=false ) {
			
			userDao.add(user);
			emailService.send(user.getEmail(),"Added to my system" );
		}else {
			System.out.println("Try again");
		}
	}

	@Override
	public User getByEmail(String email) {
		return userDao.getByEmail(email);
	}


	@Override
	public List<User> getAll() {
		for (User user : userDao.getAll()) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}
		return userDao.getAll();
	}

	
}
