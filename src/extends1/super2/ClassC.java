package extends1.super2;

public class ClassC extends ClassB {

	public ClassC() {
		super(10, 20); //기본 생성자 불가 -> ClassB에서 생성자 새로 정의함
					   //부모에게 기본 생성자가 없는 경우 super를 직접 정의해야 한다
		System.out.println("ClassC 생성자");
	}
	
}
