package poly.ex.pay1;

//Null Object Pattern : null 대신 사용하는 객체
public class DefaultPay implements Pay {

	@Override
	public boolean pay(int amount) {
		System.out.println("결제 수단이 없습니다.");
		return false;
	}
	
}
