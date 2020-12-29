package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student kristal = new Student("kristal", 5000);
		Student kim = new Student("kim", 10000);
		
		Bus bus100 = new Bus(100);
		kristal.takeBus(bus100);
		kristal.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		kim.takeSubway(subwayGreen);
		kim.showInfo();
		subwayGreen.showInfo();

	}

}
