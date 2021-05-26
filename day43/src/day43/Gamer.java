package day43;

public class Gamer {
	private int id;
	private String firstName;
	private String LastName;
	private int dateOfBirth;
	private String nationalityId;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
}
