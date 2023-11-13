package exception;

import java.util.Scanner;

public class Ex04 {
	static int getDive(int n1, int n2){
		return n1 / n2;
	}
	public static void main(String[] args) {
		int n1, n2, answer;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 2개 입력");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		try {
			answer = getDive(n1,n2);	
			
		} catch (ArithmeticException e) {
			System.out.println("숫자를 0으로 나눌 수 없습니다");
			answer = 0;
		}
		
		System.out.printf("%d / %d = %d\n",n1,n2,answer);
		sc.close();
	}

}
