package day5.business.abstracts;

import java.util.List;

import day5.entities.concerets.User;

public interface UserService {

	void add(User user);

	User getByEmail(String email);

	List<User> getAll();
}
