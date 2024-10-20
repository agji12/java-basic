package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {

	public static void main(String[] args) {
		PayService payService = new PayService();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("결제 수단을 입력하세요: ");
			String payOption = sc.nextLine();
			
			if(payOption.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			System.out.print("결제 금액을 입력하세요: ");
			int payAmount = sc.nextInt();
			sc.nextLine(); //버퍼 뒤에 숫자만 읽어 \n 남는 문제가 생길 수 있어 해줘야 한다.
			
			payService.processPay(payOption, payAmount);
		}
	}

}
