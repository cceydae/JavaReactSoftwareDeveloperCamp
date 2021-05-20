package day3;

public class Student extends User {
	private String coursName;

	public Student(int id, String allName, String email, String password, String coursName) {
		super(id, allName, email, password);
		this.coursName = coursName;
	}

	public String getCoursName() {
		return coursName;
	}

	public void setCoursName(String coursName) {
		this.coursName = coursName;
	}
}
