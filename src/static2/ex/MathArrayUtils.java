package static2.ex;

public class MathArrayUtils {

	private MathArrayUtils() {
		//인스턴스를 생성하지 못하도록 -> 제약이 있는 것이 좋은 개발!
	}
	
	public static int sum(int[] values) {
		int sum = 0;
		for(int i : values) {
			sum += i;
		}
		return sum;
	}
	
	public static double average(int[] values) {
//		int sum = 0;
//		int count = 0;
//		for(int i : values) {
//			sum += i;
//			count++;
//		}
//		return sum / count;
		//위에서 구했기 때문에 합계를 또 구할 필요가 없다.
		//소숫점이 나올 수 있기 때문에 double로 캐스팅
		return (double) sum(values) / values.length;
	}
	
	public static int min(int[] values) {
		//int min = 6;
		int min = values[0]; //배열 0번째에 있는 값 넣어두기!
		for(int i : values) {
			if(i < min) {
				min = i;
			}
		}
		return min;
	}
	
	public static int max(int[] values) {
		//int max = 0;
		int max = values[0];
		for(int i : values) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	
}
