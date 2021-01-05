package arrayList;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentKristal = new Student(1001, "Kristal");
		studentKristal.addSubject("국어", 100);
		studentKristal.addSubject("수학", 64);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 88);
		studentKim.addSubject("수학", 76);
		
		studentKristal.showStudentInfo();
		studentKim.showStudentInfo();
	}

}
