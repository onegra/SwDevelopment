package control;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int num1;
		int num2;
		int year;
		int month;
		int day;
		int gender;
		
		System.out.println("주민등록번호 13자리");
		System.out.println("입력 : ");
		input = sc.next();
		
		num1 = Integer.parseInt(input.split("-")[0]);
		num2 = Integer.parseInt(input.split("-")[1]);
		
		gender = num2 / 1000000;
		year = num1 / 10000;
		month = (num1 -( year * 10000 ))/100;
		day = num1 % 100;
		
		switch(gender) { 
		case 1: year +=1900; System.out.println("성별은 남성입니다");break;
		case 2: year +=1900; System.out.println("성별은 여성입니다"); break;
		case 3: year +=2000; System.out.println("성별은 남성입니다"); break;
		case 4: year +=2000; System.out.println("성별은 여성입니다"); break;
		}
		
		System.out.println("주민등록번호 앞자리 : "+num1);
		System.out.println("주민등록번호 뒷자리 : "+num2);
		System.out.println();
		System.out.printf("4자리 출생연도 : %d년, 출생월 : %d월, 출생일 : %d일",year, month,day);
		
		//4자리 출생연도, 2자리의 출생월, 2자리의 출생일
		//그리고 성별은 문자열로 준비하여 모두 출력하세요
	}

}
