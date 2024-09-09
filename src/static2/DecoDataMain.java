package static2;

//import static static2.DecoData.staticCall;
import static static2.DecoData.*;

public class DecoDataMain {

	public static void main(String[] args) {
		System.out.println("1. 정적 호출");
		//DecoData.staticCall();
		staticCall();
		staticCall();
		staticCall(); //import하는 경우 클래스명을 생략할 수 있다.
		
		System.out.println("2. 인스턴스 호출1");
		DecoData data1 = new DecoData();
		data1.instanceCall();
		
		System.out.println("3. 인스턴스 호출2");
		DecoData data2 = new DecoData();
		data2.instanceCall();
		
		//DecoData.staticCall(data1);
		
		//추가
		//인스턴스를 통한 접근
		DecoData data3 = new DecoData();
		data3.staticCall(); //언뜻보기에 클래스에 접근하는 것 같기 때문에 이렇게 쓰지 않는 것이 좋다.
		
		//클래스를 통한 접근
		DecoData.staticCall();
	}
	
}
