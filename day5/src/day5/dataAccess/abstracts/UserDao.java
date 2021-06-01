package day5.dataAccess.abstracts;

import java.util.List;

import day5.entities.concerets.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete (User user);
	User get(int id);
	User getByEmail(String email);
	User getByEmailandPassword(String email, String password);
	List<User> getAll();
	
}
