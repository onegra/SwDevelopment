package quiz;

import java.util.Random;
import java.util.Scanner;

class Quiz05 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int eleA, eleB, eleC;
		int mylocation;
		int distanceA,distanceB,distanceC;
		
		eleA = ran.nextInt(15) + 1;
		eleB = ran.nextInt(15) + 1;
		eleC = ran.nextInt(15) + 1;
		
		System.out.printf("%d, %d, %d\n",eleA,eleB,eleC);
		
		//현재 자신의 위치를 1~15사이로 입력한 다음
		//가장 가까운 엘리베이터가 몇번째인지 출력하는 코드를 작성하세요
		//(가장 가깝다 = 거리값이 최소이다 = 차이의 절대값이 최소값이다)
		
		System.out.println("내 위치");
		mylocation = sc.nextInt();
		
		System.out.printf("현재 위치: %d층\n",mylocation);

		
		distanceA = mylocation - eleA;
		distanceB = mylocation - eleB;
		distanceC = mylocation - eleC;
		
		if(distanceA < 0) {
			distanceA = -distanceA;	
		}
		else {
			distanceA=distanceA;
		}
		if(distanceB<0) {
			distanceB= -distanceB;	
			}
		else {
			distanceB=distanceB;
			}
		if(distanceC<0) {
			distanceC= -distanceC;	
		}
		else {
			distanceC=distanceC;
			}
		
		if(distanceA<distanceC && distanceA<distanceB) {
			System.out.println("A엘리베이터가 가장 가깝습니다");
		}
		else if(distanceB<distanceA && distanceB<distanceC) {
			System.out.println("B엘리베이터가 가장 가깝습니다");
		}
		else if(distanceC<distanceA && distanceC<distanceA) {
			System.out.println("C엘리베이터가 가장 가깝습니다");
		}

	}

	

}
