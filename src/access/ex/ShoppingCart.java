package access.ex;

public class ShoppingCart {

	private Item[] items = new Item[10];
	private int itemCount; //private int itemCount = 0 와 같다.
	
	public void addItem(Item item) {
		if(itemCount >= items.length) {
			System.out.println("장바구니가 가득 찼습니다.");
			return;
		}
		
		//items[itemCount++] = item; 한 줄로 이렇게 해도 된다.
		items[itemCount] = item;
		itemCount++;
	}
	
	public void displayItems() {
		//int count = 0;
		
		System.out.println("장바구니 상품 출력");
		for(int i=0;i < itemCount;i++) {
			//count += items[i].getItem(items[i]);
			Item item = items[i];
			System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
		}
		//System.out.println("전체 가격 합:" + count);
		System.out.println("전체 가격 합:" + calculateTotalPrice());
	}
	
	// 이 클래스 안에서만 사용
	private int calculateTotalPrice() {
		int totalPrice = 0;
		for(int i = 0;i < itemCount;i++) {
			Item item = items[i];
			totalPrice += item.getTotalPrice();
		}
		return totalPrice;
	}
	
}
