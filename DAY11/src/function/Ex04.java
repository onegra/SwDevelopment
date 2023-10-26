package function;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		//공부할때 제외하고 공부하기
		//자판기
		//돈을 입력받은 다음, 상품을 준비하고, 준비된 상품 수량 안에서 상품을 판매하고
		//거스름돈을 계산하여 내어주는 프로그램
		//변수의 개수가 너무 많고 관련성 있는 변수들을 묶어서 처리할 방법이없다!!
		
		//콜라, 사이다, 비타민, 이온음료
		int cokeAmount =3;
		int ciderAmount =3;
		int vitaminAmount=3;
		int ionAmount=3;
		
		int cokePrice =800;
		int ciderPrice=700;
		int vitaminPrice=500;
		int ionPrice=1000;
		
		int money_income = 0;  //입력받는 돈을 저장할 변수
		int money_remainder = 0;  //거스름돈을 계산하여 출력할 변수
		
		Scanner sc =new Scanner(System.in);
		int menu = 0;
		
		String result; //함수의 실행결과를 받기 위한 변수
		
		LOOP : while(true) {
			System.out.printf("자판기 현재 금액 : %d\n",money_income);
			System.out.println("1. 금액 투입");
			System.out.println("2. 음료 선택");
			System.out.println("0. 종료");
			System.out.println("선택 >>>");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: //돈을 입력받아서 money_income에 저장하고 다시 반복
				System.out.println("금액을 입력 : ");
				money_income += sc.nextInt();
				break;
			
			case 2: //상품 목록을 보여주고, 선택받아서 금액을 계산하고 수량을 감소시키고 출력
				System.out.printf("1)콜라\t(%d)\n",cokePrice);
				System.out.printf("2)사이다\t(%d)\n",ciderPrice);
				System.out.printf("3)비타음료\t(%d)\n",vitaminPrice);
				System.out.printf("4)이온음료\t(%d)\n", ionPrice);
				menu = sc.nextInt();
				
				if(menu == 1 && cokeAmount > 0 && money_income >= cokePrice) {
					cokeAmount -= 1;
					money_remainder = money_income - cokePrice;
					money_income = 0;
					System.out.println("콜라 음료 나왔습니다");
					 System.out.printf("거스름돈 : %d원\n", money_remainder);
				}
				else if (menu == 2) {
					result = vending(menu, money_income, ciderAmount);
					if (result.startsWith("[")==false) {
						money_remainder = Integer.parseInt(result);
						money_income = 0;
					}
					else {
						System.out.println(result);
					}
				}
				else if (menu == 3) {
					result = vending(menu, money_income, vitaminAmount);
				}
				else if (menu == 4) {
					result = vending(menu, money_income, ionAmount);
				}
				else {
					System.out.println("상품 수량이 부족하거나 금액이 부족합니다");
				}
				break;
				
			case 0: break LOOP;
			
			default : System.out.println("잘못 입력하셨습니다");
			}
			System.out.println("================");
		}
		sc.close();
	}
	static String vending(int menu,int money, int amount) {
		String name = "";
		int price = 0;
		
		switch(menu) {
		case 1: 
			name = "콜라";
			price = 800;
			break;
		case 2: 
			name = "사이다";
			price = 700;
			break;
		case 3: 
			name = "비타음료";
			price = 500;
			break;
		case 4: 
			name = "이온음료";
			price = 1000;
			break;
		} 
		if (amount < 1) {
			return "[수량이 부족합니다]";
		}
		if (money < price) {
			return "[금액이 부족합니다]";
		}
		
		System.out.printf("%s 음료 나왔습니다\n",name);
		System.out.printf("거스름돈 %d원\n",money- price);
		
		return String.valueOf(money-price);
	}
}
