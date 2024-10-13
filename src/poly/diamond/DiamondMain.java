package poly.diamond;

public class DiamondMain {

	public static void main(String[] args) {
		//InterfaceA 생성불가
		//InterfaceA a = new InterfaceA();
		
		InterfaceA a = new Child();
		a.methodA();
		a.methodCommon();
		
		InterfaceB b = new Child();
		b.methodB();
		b.methodCommon();
		
		Child c = new Child();
		c.methodCommon();
	}
	
}
