
public class StudentTest {
	public static void main(String[] args) {
		//Object Creation or Instantiation
		Student s1 = new Student();
		s1.displayStudentDetails();
		
		Student s2 = new Student(1001, "Smith", 55000.0);
		s2.displayStudentDetails();
	}
}
