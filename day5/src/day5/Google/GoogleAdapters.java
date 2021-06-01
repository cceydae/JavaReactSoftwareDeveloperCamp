package day5.Google;

import day5.core.EmailService;

public class GoogleAdapters implements EmailService {

	@Override
	public void send(String email, String message) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();

		googleAuthManager.login(email, message);

	}

}
