package access.ex;

public class MaxCounter {

	private int count = 0;
	private int max;
	
	//다른 패키지에서도 사용하려면 default도 안 된다.
	public MaxCounter(int max) {
		this.max = max;
	}
	
	public void increment() {
//		if(isCountCheck()) {
//			count++;
//		}else {
//			System.out.println("최대값을 초과할 수 없습니다.");
//		}
		//검증 로직
		if(count >= max) {
			System.out.println("최대값을 초과할 수 없습니다.");
			return;
		}
		
		//실행 로직
		count++;
	}
	
	public int getCount() {
		return count; 
	}
	
	// 굳이 만들지 않아도 된다.
//	private boolean isCountCheck() {
//		return count < max;
//	}
	
}
