package staticex;

public class Student {

	private static int serialNum = 10000;
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10; // 지역 변수
		
		i++;
		System.out.println(i);
		
		//studentName = "ㄱㄱㅇ"; // 멤버 변수, 인스턴스 변수(스태틱안에서 사용불가)
		
		return serialNum; // static 변수, 클래스 변수
	}


	// set을 선언 안해주면 가져갈수만 있지 변경은 불가함
	
	
}
