package oop;

/*
 편의점에서 성인/미성년자 여부에 따라 상품을 판매하려고 합니다
 손님 클래스는 이름과 나이로 구성되어 있습니다
 */
class Costomer {
	//1)문자열 형태의 이름과 정수 형태의 나이를 저장할 수 있는 필드를 작성하세요
	String name;
	int age;
	
	//2)손님 객체는 반드시 이름과 나이가 지정되어 있어야 합니다
	//생성자를 활용하여 매개변수로 이름과 나이를 전달받은 후 필드에 저장하도록 작성하세요
	Costomer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//3)손님의 간략한 정보를 확인하기 위한 void show()함수를 작성하세요
	//printf를 이용하여 이름과 나이를 한 줄에 출력하면 됩니다
	void show() {
		System.out.printf("%s, %d세 입니다\n",name, age);
	}
	
	//4)손님이 성인인지 아닌지 판별하기 위한 isAdult()를 작성합니다
	boolean isAdult() {
		boolean answer; //지역변수
		answer = age >= 20; //age는 지역변수로 존재하지 않아서 맴버필드를 참조한다
		return answer; //함수 영역내에서 가까운 요소를 참조한다
	}
	
	//7)생성자를 추가로 작성하여(오버로딩), 이름만으로도 객체를 생성할 수 있도록 한다
	//이때 값을 초기화하지 않은 age의 값은 0이다
	Costomer(String name) {
		this.name = name;
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		//5)성인 2명 미성년자1명 총 3개의 손님 객체를 생성하세요
		//이름과 나이는 자유롭게 지정하면 됩니다
		Costomer ob1 = new Costomer("홍길동",24);
		Costomer ob2 = new Costomer("김영희",15);
		Costomer ob3 = new Costomer("박철수",26);
		Costomer ob4 = new Costomer("둘리");
		
		//6)손님 객체 3명을 배열로 묶은 다음
		//반복문을 이용하여 손님의 성인 여부에 따라 판매 가능 / 불가능을 출력합니다
		Costomer[] arr = { ob1, ob2, ob3, ob4 };
		for (int i = 0; i < arr.length; i++) {
			Costomer member = arr[i];
			member.show();
			if(member.isAdult()) {
				System.out.println("상품 판매 가능");
			}
			else {
				System.out.println("상품 판매 불가능");
			}
			System.out.println();
		}
	}

}
