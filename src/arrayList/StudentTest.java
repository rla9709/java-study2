package arrayList;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentKristal = new Student(1001, "Kristal");
		studentKristal.addSubject("����", 100);
		studentKristal.addSubject("����", 64);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("����", 88);
		studentKim.addSubject("����", 76);
		
		studentKristal.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
