package hiding;

class BirthDay {
	// 1. public은 모든 클래스안에서 쓸 수 있음
	// 2. private은 해당 클래스 안에서만 사용 함
	// 3. 아무것도 안 쓸 경우(디폴트) 같은 패키지 안에서는 업셋 가능
	private int day;
	private int month;
	private int year;
	//무결성에 문제가 생길수 있을경우 private를 사용하고 게터세터를 사용해서 정의함.
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		
		if(month == 2) {
			if(day < 1 || day > 28) {
				System.out.println("날짜 오류입니다.");
			} 
		} else {
			this.day = day;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	
}

public class BirthDayTest {
	
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();
		day.setMonth(2);
		day.setDay(30);
		day.setYear(2021);
	}
	
}