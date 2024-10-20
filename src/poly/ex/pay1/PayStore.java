package poly.ex.pay1;

//결제 수단을 보관하고 관리하는 클래스
//생성이 안 되도록 abstract class
public abstract class PayStore {
	
	//변하는 부분
	public static Pay findPay(String option) {
		//Pay pay;
		if (option.equals("kakao")) {
			//pay = new KakaoPay(); // 굳이 변수 선언할 필요없이 바로 리턴하면 된다.
			return new KakaoPay();
		} else if (option.equals("naver")) {
			return new NaverPay();
		} else if (option.equals("new")) {
			return new NewPay();
		} else {
//			System.out.println("결제 수단이 없습니다.");
//			return null;
			return new DefaultPay();
		}
	}
	
}
