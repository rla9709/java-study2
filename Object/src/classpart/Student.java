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
		studentKim.studentName = "�����";
		studentKim.address = "�泲 â���� ��â�� �ﵿ�� 121";
		
		studentKim.showStudentInfor();
	}*/
	
	//Ŭ������ �޼���� ǥ�� �ϴ� ����
	
	public	String	getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args ) {
		
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.studentID = 100;
		studentLee.address = "����� �������� ���ǵ���";
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "���ֽ�";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);
		System.out.println(studentKim)
		;
//		�ν��Ͻ��� ���޸𸮿� �����Ǽ� ����ص� �Ȼ����(���ø޸𸮶� �ݴ�)
		
	}
}


