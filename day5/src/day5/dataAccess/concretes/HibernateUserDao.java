package day5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5.dataAccess.abstracts.UserDao;
import day5.entities.concerets.User;

public class HibernateUserDao implements UserDao {
	
	private List<User> users =new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println("New user added to system: " + user.getFirstName());

	}

	@Override
	public void update(User user) {
		System.out.println("User update: " + user.getFirstName());

	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted: " + user.getFirstName());

	}

	
	
	@Override
	public User get(int id) {
		for (User user : users) {
			if (user.getId() == id)
				return user;
		}
		return null;
	}
	

	@Override
	public User getByEmail(String email) {
		for (User user : users) {
			if (user.getEmail() == email)
				return user;
		}
		return null;
	}

	
	@Override
	public User getByEmailandPassword(String email, String password) {
		for (User user : users) {
			if (user.getEmail() == email && user.getPassword() == password)
				return user;
		}
		return null;
	}
	

	@Override
	public List<User> getAll() {
		return users;
	}

}
