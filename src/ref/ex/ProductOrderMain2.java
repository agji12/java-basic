package ref.ex;

public class ProductOrderMain2 {

	public static void main(String[] args) {
		// 여러 상품의 주문 정보를 담는 배열 생성
		ProductOrder[] productOrders = new ProductOrder[3];
		
		// createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
		productOrders[0] = createOrder("두부", 2000, 2);
		productOrders[1] = createOrder("김치", 5000, 1);
		productOrders[2] = createOrder("콜라", 1500, 2);
		
		// printOrders()를 사용해서 상품 주문 정보 출력
		printOrders(productOrders);
		
		// getTotalAmount()를 사용해서 총 결제 금액 계산
		int totalAmount = getTotalAmount(productOrders);
		
		// 총 결제 금액 출력
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