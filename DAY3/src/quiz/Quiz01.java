package quiz;

import java.util.Scanner;

public class Quiz01 { 
	public static void main(String[] args) {
		//이름과 나이를 입력받고
		//나이를 이용하여 성인여부를 문자열로 준비한 다음
		//이름 나이 성인여부를 한 문장에 출력하는 코드를 작성하세요
		//(단, 성인은 20세 이상입니다)
		
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = sc.nextLine(); 
		
		System.out.println("나이를 입력하세요");
		age = sc.nextInt(); 
		
		boolean isAdult = age >= 20; 
		
		System.out.printf("이름 : %s, 나이 : %d, %s", name, age, isAdult ? "성인입니다" : "미성년자입니다");
		
		sc.close();
		
		/*
		// 1) 변수 선언 및 초기화
		//문제에서 사용해야할 값(결과를 결정하는데 요인이되는 값 = 변수)
		//요인이 되는 값이 어떤것이 있는지 파악하고, 자료형에 맞춰서 변수를 선언
		String name;
		int age;
		boolean isAdult;
		Scanner sc;
		sc = new Scanner(System.in);
		
		//2) 입력 입력받아야 하는 값을 순서대로 입력받는다
		//자료형에 따라 실행(호출)하는 함수가 서로 다르다(함수의 종류는 알아둬야 한다)
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		//3) 연산
		// 빈 값이 있는가? isAdult값이 아직 준비되지 않았다
		//age의 값을 이용하여 isAdult의 값을 계산한다
		isAdult = age >= 20;
		
		//4) 출력
		//모든 값이 준비되었다며 서식을 준비하고 값을 출력한다
		System.out.printf("%s님은 %d살이고, %s입니다", name, age, isAdult ? "성인" : "미성년자");
		
		//5) 마무리 
		sc.close();
		
		*/
		
		
		
}

}
