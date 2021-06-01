package day5.business.abstracts;

import day5.entities.concerets.User;
import day5.entities.concerets.UserLogin;

public interface AuthService {

	void register(User user);

	void login(UserLogin userLogin);

	boolean userEmail(String email);
}
