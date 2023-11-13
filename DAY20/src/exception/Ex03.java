package exception;

import java.util.Scanner;

class MyException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return "범위를 벗어났습니다";
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			try {
				System.out.print("정수 : ");
				num = sc.nextInt();
				if(0 <= num && num <= 100) {
					break;
				}
				MyException e = new MyException();
				throw e;
			} catch(MyException e) {
				System.out.println(e);
				continue;
			}
		}
		sc.close();
		System.out.println("프로그램종료");
	}

}
