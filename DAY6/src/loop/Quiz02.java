package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int answer = ran.nextInt(100) + 1;
		int user;
		int count = 0;
		
		//반복을 수행하면서 사용자에게 값을 입력받고 만약 정답이 입력값보다 작으면 down 정답이 입력값보다 크면 up 일치하면 반복을 중단
		//반복할때마다 횟수를 증가시키기
		//반복이 끝나면 정답과 횟수를 출력하고 종료
		
		while(true) {
			
			System.out.println("1~100 사이의 값을 입력하세요");
			user = sc.nextInt();
			count++;
			
			if(user == answer) {
				System.out.printf("정답:%d, 도전한 횟수:%d",answer,count);
				break;
			}
			else if (user < answer) {
				System.out.println("up");
			}
			else if(user> answer) {
				System.out.println("down");
			}
		}
		
	}

}
