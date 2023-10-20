package loop;

public class Ex01 {
	public static void main(String[] args) {
		//for : 일정 횟수만큼 반복하여 코드를 수행하기 위해 사용헌더
		//여기서 일정 횟수는 직접 지정할 수도 있고, 특정 배열 및 컬랙션 요소의 길이만큼
		//다시말해 변수의 개수만큼 반복하여 사용할 수도 있다
		
		//내부 요소가 여러개가 있고, 그 여러개의 요소만큼 반복돌릴수 있는 형태를
		//iterable하다 라고 표현한다
		
		for(int i = 0; i<5; i++) {
			System.out.println("hello");
		}
		System.out.println();
		for(int i = 0; i<5; i++) {
			System.out.println(i);
	}
		System.out.println();
		//1) 지역변수 : 함수의 {} 및 제어문의 {} 안에서 선언된 변수는 
		//해당 지역 내에서만 유효하다
		//{}블럭을 벗어나면 참조할 수 없고, 같은 이름의 새로운 변수를 생성 할 수도 있다
		
		int num1 = 5;  //main 함수 안에서 선언된 변수
		if(num1 > 2) {
			int num2 = 3; // 변수의 선언 위치에 따라 유효범위가 달라진다
			num1 += num2; // num1은 다른 제어문안에서도 참조가능
			System.out.println("num2 : "+ num2); 
		}
		System.out.println("num1 : "+ num1);
		// System.out.println("num2"+num2); 
		//num2 cannot be resolved to a variable
		//if가 종료되면서 num2도 소멸한다
		
		int num2 =1234; 
		System.out.println(num2);  //지역변수는 갈색
		Test ob = new Test();
		System.err.println(ob.n1); //클래스의 멤버필드는 파란색
		
		//반복문이 끝난 후에도 값을 남겨서 참조하고 싶다면
		//해당 변수의 선언문을 반복문 이전에 작성해야 한다
		
		int sum = 0;
		for (int i =0; i<=100; i++) {
			sum += 1;
		}
		System.out.println("sum : " + sum);
	}	

}
class Test {
	int n1 = 10; //클래스 영역에서 선언되고
	int n2 = 20; //클래스를 이용한 객체에서 참조가 가능한 변수(필드)
}