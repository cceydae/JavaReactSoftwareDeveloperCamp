package day3;

public class Instructor extends User {
	private String autobiography;

	public Instructor(int id, String allName, String email, String password, String autobiography) {
		super(id, allName, email, password);
		this.autobiography = autobiography;
	}

	public String getAutobiography() {
		return autobiography;
	}

	public void setAutobiography(String autobiography) {
		this.autobiography = autobiography;
	}
	
}
