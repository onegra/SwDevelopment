package quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		//지하철 1구간당 평균 소요시간이 4분이라고 가정한다
		//이동한 구간수를 입력받아서 이동하는데 걸리는 시간을 출력하세요
		//단 이동한 시간이 60분이하이면 분으로만 출력하고 
		//이동한 시간이 60분을 초과하면 시간과 분으로 나누어서 출력하세요
		
		int subway;
		int min;
		int hours;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이동한 구간 수를 입력하세요");
		subway = sc.nextInt();
		min = subway * 4;
		
		if(min>=60) {
			hours = min / 60;
			min = min % 60;
			System.out.printf("이동한 시간은 %d시 %d분 입니다",hours,min);
		}
		else if(min<60) {
		
			System.out.printf("이동한 시간은 %d분 입니다",min);
		}

		/*
		Scanner sc = new Scanner(System.in); //입력받기 위한 객체
		int perstation = 4; //구간당 4분
		int minute; //조건에 따라 사용할 변수
		int hours;
		int distance; //이동한 구간 수(입력받아야 함)

		System.out.println("구간 수"); //입력 안내 메시지
		distance = sc.nextInt(); //입력받기
		
		minute = distance*perstation; //입력값으로 분 구하기
		
		if(minute <= 60) { //분이 60이하이면
			System.out.println("걸린시간: "+minute+"분"); //그냥출력 
		}
		else { //아니면(60을 초과하면)
			hours = minute / 60; //시간은 전체시간에서 60을 나눈 몫
			minute %=60; //분은 전체시간에서 60을 나눈 나머지
			System.out.printf("걸린시간 : %d시간 %d분\n",hours,minute); //각각출력
			sc.close(); //마무리
			
		
		}*/
	}


}
