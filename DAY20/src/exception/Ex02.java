package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		try {
		System.out.print("정수 : ");
		num = sc.nextInt();
		System.out.println("num : " + num);
		
		} catch(InputMismatchException e) {
			System.out.println("정수를 입력해야 합니다");
			System.out.println(e.getMessage());
			e.printStackTrace();
			num = -1;
		
		} finally {
			sc.close();
			System.out.println("프로그램 종료");
		}
		
	}

}
