package inhreitance;

public class GoldCustomer extends Customer{

	public GoldCustomer() {
		
		bonusRatio = 0.05;
	}


	@Override //에너테이션(컴파일러에게 어떤 일을 하는지 알려주는 역할)
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}
	
	
}
