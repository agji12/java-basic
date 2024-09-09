package static2;

public class DecoData {

	private int instanceValue;
	private static int staticValue;
	
	public static void staticCall() {
		//instanceValue++; //인스턴스 변수 접근, compile error
		//instanceMethod(); //인스턴스 메서드 접근, compile error
		
		staticValue++; //정적 변수 접근
		staticMethod(); //정적 메서드 접근
	}
	
	public static void staticCall(DecoData data) { //외부에서 참조값 넘겨옴
		data.instanceValue++; //static 메서드에서 참조값을 통한 접근은 당연히 된다!
		data.instanceMethod();
	}
	
	public void instanceCall() {
		instanceValue++; //인스턴스 변수 접근
		instanceMethod(); //인스턴스 메서드 접근
		
		staticValue++; //정적 변수 접근 DecoData.staticValue++; 와 같다.
		staticMethod(); //정적 메서드 접근
	}
	
	private void instanceMethod() {
		System.out.println("instanceValue=" + instanceValue);
	}
	
	private static void staticMethod() {
		System.out.println("staticValue=" + staticValue);
	}
	
}