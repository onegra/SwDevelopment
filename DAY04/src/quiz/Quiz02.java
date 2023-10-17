package quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		//2의 배수 혹은 3의 배수 혹은 6의 배수를 각각 구분하여 출력하세요
		//정수를 하나 입력받고, 위 3개중 해당하는 하나만 출력하면 됩니다
		//6의 배수를 입력받으면 2와 3의 배수에 모두 해당되지만 6의 배수만 출력해야 합니다
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		num = sc.nextInt();
		if(num%6==0) {
			System.out.printf("%d는 6의 배수입니다",num);
		}
		else if(num%2==0) {
			System.out.printf("%d는 2의 배수입니다",num);
		}
		else if(num%3==0) {
			System.out.printf("%d는 3의 배수입니다",num);
		}
		else {
			System.out.printf("%d는 2,3,6의 배수가 아닙니다",num);
		} //else로 마무리하는 형식을 권장하지만 상황에 따라서 작성하지 않는 경우도 있다
		sc.close();
	}

}
