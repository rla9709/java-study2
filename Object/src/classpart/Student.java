package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
	}
	
/*	public static void main(String[] args) {
		
		Student studentKim = new Student();
		studentKim.studentName = "김경윤";
		studentKim.address = "경남 창원시 의창구 삼동로 121";
		
		studentKim.showStudentInfor();
	}*/
	
	//클래스를 메서드로 표현 하는 예시
	
	public	String	getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args ) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구 여의도동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "경주시";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);
		System.out.println(studentKim)
		;
//		인스턴스는 힙메모리에 생성되서 사용해도 안사라짐(스택메모리랑 반대)
		
	}
}


