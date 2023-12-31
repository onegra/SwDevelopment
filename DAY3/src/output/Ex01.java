package output;

import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		//자바의 기본 출력함수 3가지
		
		// System.out.println() 괄호안에 하나의 값을 받아서 출력한다 출력 후 한줄 내린다
		// System.out.print() 괄호안에 하나의 값을 받아서 출력한다 줄을 바꾸지 않는다
		// System.out.printf() 괄호안에 서식과 값을 차례대로 전달받아서 출력한다
		
		System.out.println("a" + "aa"); // 연산자는 값을 만들어내는 기호이기 때문에 괄호안의 계산이 먼저 진행되고 계산의 결과값하나가 출력되는 순서이다.
		System.out.println("b");
		System.out.println("c");
		
		System.out.print("d"); // 둘 다 출력할 값의 자료형이 무엇이라도 출력할 수 있다
		System.out.print("e");
		System.out.print("f");
		
		Date today = new Date(); //실행하는 시점에 날짜 데이터 내장
		
		System.out.println(today);
		System.out.println(today.toString());
		
		System.out.println(1);
		System.out.println(23);
		System.out.println(4.5f);
		System.out.println(Integer.class);
		
		System.out.print("A"); //print()는 출력 후 줄을 바꾸지 않는다
		System.out.print("\n"); //\n은 줄바꿈 문자(개행문자, newline, linefeed)이다
		System.out.print("B");//따라서 print("\n)과 println()온 같은 역할이다
		System.out.print("\r");//r은 커서를 줄 왼쪽끝으로 이동시킨다 :CarrigeRetrue	}
		System.out.print("c"); //r더 엔터의 값임,로 줄을 바꾼다
		System.out.println(); //보통 줄만 바꾸고 싶을때 printli로 합격을 사용한다
		
		String lyrics = "동해물과 백두산이 마르고 닳도록\r\n";
				lyrics += "하느님이 보우하사 우리나라 만세";
				
				//+연산자는 숫자간의 연산에서 숙자를 계산하고
				//+문자열이 양쪽중 한곳에 포함되면, 문자열을 베이스로 하여 글자를 이어붙이지 한다
				//산술연산자는 복합대입연산자 형식으로 사용할 수 있기 때문에
				//yyris에 처음 값을 지정한 후
				//기존 값을 유지하면서 새로우 내용을 덧붙이기(APPEND)할때 사용할 수 있다

		System.out.println(lyrics);
		System.out.println();
		
	    System.out.println(1+2);         //3 양쪽 모두 숫자이므로 계산한다
		System.out.println("1"+2);       //12 왼쪽이 문자열
		System.out.println(1 + "2");     //12 오른쪽이 문자열
		System.out.println("1" + "2");   //12 양쪽이 문자열, 글자모양을 이어붙인다
		
		//print와 println의 차이는 주로 반복문 내부에서 값을 연속으로 출력할 때 활용한다
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i + " "); //i를 출력하고 한 칸 띄어쓰기하고 줄은 바꾸지 않기
			
			System.out.println(); //출력이 다 끝나면 줄 바꾸기
			
			for(int i = 0; i < 5; i++) {
				System.out.println(i); //값을 출력할 때 마다 계속 줄 바꾸기
				
				int num = 1234;
				String num2 = 1234 + "";
						//String이 아닌 값을 가장 쉽게 문자열로 바꾸는 방법은 기존 값에 빈 문자열을 더하는 방법이다
			
			
		}
	}
