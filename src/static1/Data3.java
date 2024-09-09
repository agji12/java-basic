package static1;

public class Data3 {
	public String name;
	public static int count; //static
	
	public Data3(String name) {
		this.name = name;
		count++;
		//Data3.count++; //원래는 이게 맞다 하지만 생략 가능
	}
}
