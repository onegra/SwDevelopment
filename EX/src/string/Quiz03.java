package string;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		/*
		 16자리의 카드번호를 문자욜로 입력받아서
		 카드번호의 오른쪽끝에서부터 세어서
		 홀수번호는 그대로 두고
		 짝수번호는 2를 곱한다
		 만약 2를 곱한 숫자가 두자리 수 이면
		 각 자리수를 더해서 한자리 수로 만든다
		 이렇게 만들어진 16개의 한자리 숫자를 모두 더하여
		 그 합이 10으로 나누어 떨어지면 유효한 카드번호
		 그렇지않으면 유효하지 않은 카드번호이다
		 (Luhn 알고리즘)
		 카드번호를 입력받아서 유효성을 검증하는 코드를 작성하세요
		 */
		String input = "";
		String input1 = "1162-3434-1010-2111";
				// 홀수는 그대로 짝수는 2배 -> 2132-6464-2020-4121 ->합계 40 : 유효하지 않는 카드번호 
		String input2 = "1162-3434-1010-2113";
		        // 홀수는 그대로 짝수는 2배 -> 2132-6464-2020-4123 ->합계 42 : 유효하지 않는 카드번호 
		Scanner sc = new Scanner(System.in);
	
		
		//-제외하고 나오기
		for(int i = 0; i<input1.length(); i++) {
			char ch = input1.charAt(i);
			
			if( '0' <= ch && ch <='9' ) {
				input1 += ch;
				
	}
	// 카드번호의 오른쪽끝에서부터 세어서 홀수번호는 그대로 두고 짝수번호는 2를 곱한다
			

}System.out.print(input1);
		
	}}