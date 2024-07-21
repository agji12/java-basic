package construct;

public class MemberConstruct {

	String name;
	int age;
	int grade;
	
	//추가
	MemberConstruct(String name, int age){
		this(name, age, 50); // 자기 자신의 생성자를 호출. 생성자 안에서만 사용 가능
		// 위의 값을 가지고 아래의 생성자를 호출. 중복 제거
//		this.name = name;
//		this.age = age;
//		this.grade = 50;
	}
	
	MemberConstruct(String name, int age, int grade){
		System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}
