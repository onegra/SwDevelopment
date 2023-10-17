package quiz;

import java.util.Random;
import java.util.Scanner;

class Quiz6 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int eleA;
		int mylocation;
		int A;
		int asdo;

	
		mylocation = sc.nextInt();
		
		eleA = ran.nextInt(15) + 1;
		
		System.out.printf("%d\n",eleA);
		System.out.printf("현재 위치: %d층",mylocation);

		
		A = mylocation - eleA;
		
		if(A<0) asdo = -A;
		else asdo = A;
		
		System.out.printf("엘리베이터 차이%d\n",asdo);
		//현재 자신의 위치를 1~15사이로 입력한 다음
		//가장 가까운 엘리베이터가 몇번째인지 출력하는 코드를 작성하세요
		//(가장 가깝다 = 거리값이 최소이다 = 차이의 절대값이 최소값이다)
	}

	

}
