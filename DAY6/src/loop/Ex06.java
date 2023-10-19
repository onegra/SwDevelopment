package loop;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		//30일 동안 은행에 돈을 입금한다
		//첫날에 10원, 그다음날에 20원, 다음날에 40원
		//이런식으로 전날의 두배를 준비하여 입금한다
		//30일째 입금이 끝난후
		//은행에 누적된 총 금액은 얼마인지 계산하여 출력하세요
		//(금액에 천단위 구분기호 콤마를 적용하여 출력하세요)
		
		Scanner sc = new Scanner(System.in);
		
		int day = 1;
		long money = 10;  
		long bank = 0;
		
		while (day < 31) {
			bank += money;
			money *= 2;
			day += 1;
		}
		System.out.printf("%d일 금액: %,d원",day,bank);
	}

}
