package reference;

public class Student {
	
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	
	public Student () {
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	public Student(int id, String name ) {
		studentID = id;
		studentName = name;
		
		korea = new Subject("국어");
		math = new Subject("수학");
	}

	
	public void setKorea( int score) {
		korea.setScore(score);
	}
	
	public void setMath( int score) {
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = (korea.getScore() + math.getScore()) / 2;	
		System.out.println(studentName + "학생의 평균은" + total + "입니다.");
	}
}
