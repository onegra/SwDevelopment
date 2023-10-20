package loop;

public class Ex03 {
	public static void main(String[] args) {
		//for문 기본 연습문제
		//1) 1~10사이 정수의 합게를 구해여 출력하세요
		int num = 0;
		for (int i = 0; i<11; i++) {
			num += i;
			if (i == 10)
			System.out.println(num);
			}
		System.out.println();
		
		//2) 11~21사이의 정수의 합계를 구해서 출력하세요
		num = 0;
		for (int i = 11; i<=20; i++) {
			num += i;
			}
		System.out.println(num); //for문 밖에 나와야 반복이 중단됨
		System.out.println();

		for (int i = 5; i>=0; i--) {
			System.out.println(i);
			
		}
	}
	
	

}
