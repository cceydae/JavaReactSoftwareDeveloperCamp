package day3;

public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println("Öğrenci: " + user.getAllName());
	}
	public void add(Student student) {
		System.out.println("Kurs ismi: " + student.getCoursName());
	}
}
