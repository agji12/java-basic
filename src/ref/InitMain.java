package ref;

public class InitMain {

	public static void main(String[] args) {
		InitData data = new InitData(); // java가 인스턴스 생성하면서 초기값을 다 넣어준다.
		System.out.println("value1 = " + data.value1);
		System.out.println("value2 = " + data.value2);
	}
	
}
