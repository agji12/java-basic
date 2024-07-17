package oop1.ex;

public class Account {
	
	//int balance = 0; //잔액
	int balance; // 멤버변수는 선언만 해도 자동으로 초기값이 입력된다.
	
	void deposit(int amount) {
		balance += amount;
	}
	
	void withdraw(int amount) {
		if(balance >= amount) { //잔액이 빼려는 금액보다 많을 때!
			balance -= amount;
		}else {
			System.out.println("잔액 부족");
		}
	}
	
}
