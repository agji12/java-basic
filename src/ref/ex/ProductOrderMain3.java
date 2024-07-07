package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 주문의 개수를 입력하세요: ");
		int size = sc.nextInt();
		sc.nextLine(); //1하고 엔터치면 숫자만 받아들이고 \\n이 남는다
		
		ProductOrder[] productOrders = new ProductOrder[size];
		
		for(int i = 0;i < size;i++) {
			System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
			
			System.out.print("상품명: ");
			String productName = sc.nextLine();
			
			System.out.print("가격: ");
			int price = sc.nextInt();
	 		
			System.out.print("수량: ");
			int quantity = sc.nextInt();
			sc.nextLine(); //입력 버퍼를 비우기 위한 코드
			
			productOrders[i] = createOrder(productName, price, quantity);
		}
		
		printOrders(productOrders);
		
		int totalAmount = getTotalAmount(productOrders);
		
		System.out.println("총 결제 금액: " + totalAmount);
	}
	
	static ProductOrder createOrder(String productName, int price, int quantity) {
		ProductOrder productOrder = new ProductOrder();
		productOrder.productName = productName;
		productOrder.price = price;
		productOrder.quantity = quantity;
		return productOrder;
	}
	
	static void printOrders(ProductOrder[] orders) {
		/*
		for(int i = 0;i < orders.length;i++) {
			System.out.println("상품명: " + orders[i].productName + ", 가격: "
					+ orders[i].price + ", 수량: " + orders[i].quantity);
		}
		*/
		// 향상된 for문 사용하기
		for(ProductOrder order : orders) {
			System.out.println("상품명: " + order.productName + ", 가격: "
					+ order.price + ", 수량: " + order.quantity);
		}
	}
	
	static int getTotalAmount(ProductOrder[] orders) {
		int totalAmount = 0;
		/*
		for(int i = 0;i < orders.length;i++) {
			totalAmount += orders[i].price * orders[i].quantity;
		}
		*/
		for(ProductOrder order : orders) {
			totalAmount += order.price * order.quantity;
		}
		return totalAmount;
	}
	
}
