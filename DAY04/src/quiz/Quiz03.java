package quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		//서로 다른 세 정수를 입력받은 다음 가장 큰 수를 하나 출력하세요

		int num1;
		int num2;
		int num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 세 개를 입력하세요");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.printf("가장 큰 수 : %d",num1);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.printf("가장 큰 수 : %d",num2);
		}
		else if (num3 > num1 && num3 > num1) {
			System.out.printf("가장 큰 수 : %d",num3);
		}
	sc.close(); 

		/*
		int n1,n2,n3,max;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 세 개를 입력하세요");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(true) max=n1;
		if(max < n2) max=n2;
		if(max < n3) max=n3;
		
		System.out.println("가장큰수"+max);
		sc.close();
		*/
	}

}
