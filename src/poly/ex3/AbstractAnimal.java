package poly.ex3;

public abstract class AbstractAnimal {

	// 자식이 오버라이딩 하도록 하는 목적
	public abstract void sound();
	
	// 그냥 자식에게 상속하는 목적
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}
