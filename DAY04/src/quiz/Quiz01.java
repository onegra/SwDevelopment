package quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 두 정수를 입력받아서 더 큰 수를 화면에 출력하시오
	
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두 개를 입력하세요");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.printf("더 큰 값 : %d",num1);
		}
		else if (num1 == num2) {
			System.out.println("값이 같습니다");
		}
		else {
			System.out.printf("더 큰 값: %d",num2);
		}
		/*	
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("n1");
		n1 = sc.nextInt();
		System.out.println("n2");
		n2 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println("더 큰 값:"+ n1);
		}
		else {
			System.out.println("더 큰 값:"+ n2);
		}
		sc.close();
		*/
	}
}
