package poly.ex.pay1;

public class PayService {
	
	//구체적인 KakaoPay, NaverPay를 알 수 없다.
	//Pay라는 역할만 알고 있다 -> Pay라는 역할에만 의존하고 있다! -> OCP 원칙 만족
	//변하지 않는 부분
	public void processPay(String option, int amount) {
		//boolean result = false;
		System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
		
		//결제 수단 선택
		Pay pay = PayStore.findPay(option);
		
		//실제로 결제하는 부분
//		if(pay != null) {
//			result = pay.pay(amount);
//		}
		//DefaultPay를 생성했기 때문에 pay는 null일 수 없다 -> null 체크 로직 없어도 된다
		boolean result = pay.pay(amount);
		
		if (result) {
			System.out.println("결제가 성공했습니다.");
		} else {
			System.out.println("결제가 실패했습니다.");
		}
	}
	
}
