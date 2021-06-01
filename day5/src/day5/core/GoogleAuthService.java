package day5.core;

import day5.entities.concerets.UserLogin;

public interface GoogleAuthService {

	void register(String email);

	void login(UserLogin userLogin);

	void userEmail(String email);
}
