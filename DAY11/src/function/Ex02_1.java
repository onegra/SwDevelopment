package function;

import java.util.Scanner;

public class Ex02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String birth;
		String result;
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		while(true) {
			System.out.print("생년월일 입력 : ");
			birth = sc.nextLine();
			boolean flag= true;
			for(int i =0; i<birth.length(); i++) {
				char ch = birth.charAt(i);
				if('0' <= ch && ch <= '9') {
					flag = false;
					
				}
				
			}
			System.err.println("생년월일은 6자리로 입력해주세요");
			break;
			}
			int year = Integer.parseInt(birth.substring(0,2));
			year +=(23< year) ? 1900 : 2000;
			int month = Integer.parseInt(birth.substring(2,4));
			int date = Integer.parseInt(birth.substring(4));
			
			int age =2023 - year; 
			String form = "%s님은 %d살이고 %4d-%02d-%02d 출생입니다";
			result = String.format(form, name, age, year, month, date);
		//System.out.println("%s님은 %d살이고 %4d-%02d-%02d 출생입니다",name, age,  year, month, date);
	}

}
