package access.a;

public class AccessData {

	public int publicField;
	int defaultField;
	private int privateField;
	
	public void publicMethod() {
		System.out.println("publicMethod 호출 " + publicField);
	}
	
	void defaultMethod() {
		System.out.println("deafultMethod 호출 " + defaultField);
	}
	
	private void privateMethod() {
		System.out.println("privateMethod 호출 " + privateField);
	}
	
	public void innerAccess() { 
		//메서드 내부 호출
		//자신의 내부에 있는 것 호출하기 때문에 출력된다.
		System.out.println("내부 호출");
		publicField = 100;
		defaultField = 200;
		privateField = 300;
		publicMethod();
		defaultMethod();
		privateMethod();
	}
	
}
