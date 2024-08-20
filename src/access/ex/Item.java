package access.ex;

public class Item {

	private String name;
	private int price;
	private int quantity;
	
	public Item(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
//	public int getItem(Item i) {
//		System.out.println("상품명:" + i.name + ", 합계:" + i.price * i.quantity);
//		return i.price * i.quantity;
//	}
	
	// 이름과 합계를 따로 가져온다
	public String getName() {
		return name;
	}
	
	// 캡슐화를 따르려면 price와 quantity 값을 사용할 수 있는 Item 클래스에
	// 메서드를 만들어준다
	// 본인의 데이터는 본인이 계산하는 것이 제일 좋다.
	public int getTotalPrice() {
		return price * quantity;
	}
	
}
