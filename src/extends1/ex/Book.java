package extends1.ex;

public class Book extends Item {

	private String author;
	private String isbn;
	
	public Book(String name, int price, String author, String isbn) {
//		super.name = name;
//		super.price = price;
		super(name, price); //부모에서 생성자를 만들어주면 된다.
		this.author = author;
		this.isbn = isbn;
	}
	
//	name은 private이라 접근이 안 된다!! 
//	public void print() {
//		System.out.println("이름:" + super.name + ", 가격:" + super.price);
//		System.out.println("- 저자:" + author + ", isbn:" + isbn);
//	}
	
	@Override
	public void print() {
		//부모의 print 메서드 실행 -> 자식의 print 메서드 실행
		super.print(); //부모의 print 메서드 호출
		System.out.println("- 저자:" + author + ", isbn:" + isbn);
	}
	
}
