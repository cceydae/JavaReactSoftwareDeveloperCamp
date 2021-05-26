package day43;

public class GamerManager implements GamerService{
	
	private ValidateUserService validateUserService;

	public GamerManager(ValidateUserService validateUserService) {
		super();
		this.validateUserService = validateUserService;
	}

	@Override
	public void singUp(Gamer gamer) {
		if(validateUserService.validate(gamer)) {
			System.out.println(gamer.getFirstName() + "added to system.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		if(validateUserService.validate(gamer)) {
			System.out.println(gamer.getFirstName()+ "account updated");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		if(validateUserService.validate(gamer)) {
			System.out.println(gamer.getFirstName()+ "account deleted");
		}
		
	}

	@Override
	public void validate(Gamer gamer) {
		if(validateUserService.validate(gamer)) {
			System.out.println(gamer.getFirstName()+ " validated by e-devlet");
		}
		
	}

	
	
	

}
