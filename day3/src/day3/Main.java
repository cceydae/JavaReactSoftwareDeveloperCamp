package day3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, "Ceyda Eser", "ceydae.1040@gmail.com", "123", "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		
		
		Instructor �nstructor = new Instructor(2, "Engin Demiro�","abc@abc.com", "abc", "asfghdfghjksdfghjk");
		
		
		UserManager studentManager = new UserManager();
		studentManager.add(student);
		
		UserManager �nstructorManager = new UserManager();
		�nstructorManager.add(�nstructor);
		
		StudentManager studentManager2 = new StudentManager();
		studentManager2.add(student);
		

	}

}
