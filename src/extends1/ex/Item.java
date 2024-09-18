package extends1.ex;

public class Item {

	private String name;
	private int price;
	
	//생성자를 통해 값 초기화
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void print() {
		System.out.println("이름:" + name + ", 가격:" + price);
	}

}