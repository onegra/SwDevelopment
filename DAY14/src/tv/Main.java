package tv;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		int menu;
		
		LOOP : while(true) {
			System.out.println("채널 올림    볼륨 올림");
			System.out.println("       전 원  음소거");
			System.out.println("채널 내림    볼륨 내림");
			System.out.println("선택>>>");
			menu = sc.nextInt();
			switch(menu) {
			
			//입력된 메뉴에 따라서 TV객체의 매서드를 호출하는 형태로 진행
			case 1: 
				tv.channelDown();
				break;
			case 3:
				tv.volumeDown();
			case 5:
				tv.turn();
				break;
			case 6:
				tv.mute();
				break;	
			case 7:
				tv.channelUp();
				break;
			case 9:
				tv.volumeUp();
				break;
			case 0:
				break LOOP;
			}
		}
		sc.close();
		System.out.println("프로그램 종료");
	}

}
