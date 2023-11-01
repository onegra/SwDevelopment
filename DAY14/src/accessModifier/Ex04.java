package accessModifier;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Human[] arr = new Human[5];
		int menu;
		String name;
		int age;
		boolean hasNull = false; //빈칸이 하나라도 있으면 true로 바꿀거다
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 종료");
			System.out.println("선택>>>");
			menu = sc.nextInt();
			switch(menu) {
			case 1: 
				hasNull = false;
				//빈칸을 찾아서 빈칸에 데이터를 입력하고 반복 탈출
				//만약 모든 칸이 채워져서 빈칸이 없으면 메시지 출력
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] == null) {
						hasNull = true;
						arr[i] = new Human();
						System.out.println("이름 입력 : ");
						name = sc.next();
						System.out.println("나이 입력 : ");
						age = sc.nextInt(); 
						arr[i].setName(name);
						arr[i].setAge(age);
						break;
					}
				}
				if( hasNull == false) {
					System.out.println("빈칸이 없습니다");
				}
				break;
			case 2: 
				//빈칸을 제외한 모든 데이터를 화면에 출력
				//만약 모든 칸이 바어 있으면 아무것도 출력하지 않는다
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] != null) {
					System.out.printf("%s : %d살\n",arr[i].getName(),arr[i].getAge());
					}
				}
				break;
			case 0:
				sc.close();
				return;
			default: 
				System.out.println("잘못 선택하셨습니다");
			}
			System.out.println();
		}
	}

}
