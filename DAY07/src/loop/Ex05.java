package loop;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		//입력받은 숫자를 이용하여 진행상황 출력하기
		Scanner sc = new Scanner(System.in);
		int maxSize = 100;
		int currentSize;
		System.out.println("현재 진행률 입력 : ");
		currentSize = sc.nextInt();
		
		System.out.print("[");
		for (int i = 0; i < maxSize/2; i++ ) {
			if(i == currentSize /4) {
				System.out.printf(" %3d %% ",currentSize); //%3d %% 3자리 수 까지 출력 100%
			}
			else if (i < currentSize / 2) {
				System.out.print("#");
			}
			else {
				System.out.print("_");
			}
			Thread.sleep(500); //500은 0.5초 1000은 1초
		}
		System.out.print("]");
		sc.close();
	}

}
