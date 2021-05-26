package day43;

public class ValidateUserManager implements ValidateUserService {

	@Override
	public boolean validate(Gamer gamer) {
		
		if(gamer.getNationalityId().length() == 11) {
			System.out.println("Successful validate.");
		return true;
		} 
		else {
			System.out.println("Failed validate.");
		return false;
		}

		
		
	}

	
}
