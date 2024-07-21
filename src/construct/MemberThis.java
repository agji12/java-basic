package construct;

public class MemberThis {
	String nameField;
	
	void initMember(String nameParameter) {
		nameField = nameParameter; // 앞에 this가 생략되어 있다.
	}
}
