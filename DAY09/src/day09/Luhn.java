package day09;

class Solution {
	public boolean solution(String cardNumber) {
		String input1 = "";
		//0) 최초문제 풀이에서는 1개의 값을 처리하는 코드를 작성한다
				//1)카드 번호에 -가 포함되어 있다면 제거해야 한다
				String s1 = cardNumber.replace("-", "");
				int sum = 0;
				
				//2)문자열에서 각 자리의 글자를 계산 할 수 있는 숫자로 추출해야 한다
				for (int i=0; i<s1.length(); i++) {
					char ch = s1.charAt(i);
					//int num = ch - 48;
					int num = Character.getNumericValue(ch);
					
				//3)왼쪽부터 index를 기준으로 세어서 짝수는 2배 홀수는 그대로 둔다
					if(i % 2 == 0 ) {
						num =num*2;
				
						//4)만약 2배한 값이 두자리수면(=10이상이면), 각 자릿수를 합친다
						if(num>=10) {
							num = (num/10) + (num % 10);
						}
					}
				
					//5) 16개의 숫자의 합계를 구할 변수가 준비되어있어야 힌다	
					sum += num;
				}
				return sum % 10 == 0;
	}
}

public class Luhn {
	public static void main(String[] args) {
		String input1 = "1162-3434-1010-2111";
		String input2 = "1162-3434-1010-2113";
		
		
		//6)검증이 끝나면 함수형태로 변경하여 여러 값을 처리할 수 있도록 한다
		Solution s = new Solution();
		System.out.println("input1 : "+s.solution(input1));
		System.out.println("input2 : "+s.solution(input2));
	}

}
