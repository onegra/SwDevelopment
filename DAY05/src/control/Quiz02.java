package control;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		/*
		 놀이공원에 있는 놀이기구에 대한 이용요금을 계산해야한다
		 이 놀이기구는 탑승하면 기본 3000원의 요금을 받고
		 이용시간에 따라 추가 요금이 발생한다
		 그 시간과 요금은 아래와 같다
		 시간    요금
		 0~30   3000
		 31~40  3500
		 41~50  4000
		 
		 시간을 분으로 입력받아서, 요금을 출력하는 프로그램을 작성하세요
		 */

		int time;
		int total;
		int add;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("탑승한 시간을 입력하세요");
		time = sc.nextInt();
		
		if(time > 30) { 
			add = (time - 31) / 10 + 1;
			total = add * 500 + 3000;
		}
		else {
			total = 3000;
		}
		System.out.printf("탑승한 시간은 %d분, 요금은 %d원 입니다.",time,total);
	}

}
