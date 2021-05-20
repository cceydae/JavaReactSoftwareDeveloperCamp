package day3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, "Ceyda Eser", "ceydae.1040@gmail.com", "123", "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)");
		
		
		Instructor ınstructor = new Instructor(2, "Engin Demiroğ","abc@abc.com", "abc", "asfghdfghjksdfghjk");
		
		
		UserManager studentManager = new UserManager();
		studentManager.add(student);
		
		UserManager ınstructorManager = new UserManager();
		ınstructorManager.add(ınstructor);
		
		StudentManager studentManager2 = new StudentManager();
		studentManager2.add(student);
		

	}

}
