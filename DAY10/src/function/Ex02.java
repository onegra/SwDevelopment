package function;

public class Ex02 {
	static int add(int n1, int n2) {
		int answer = 0; 
		answer = n1 + n2;
		return answer; 
		}
	
	static int getMinNumber(int n1, int n2, int n3) {
		int answer = 0;
		if(n1 < n2 && n1 < n2) {
			answer = n1;
		}
		if(n2 < n1 && n2 < n3) {
			answer = n2;
		}
		if(n3 < n1 && n3 < n2) {
			answer = n3;
		}
		return answer; 
	}
	
	static String upperCase(String text) {
		String answer = "";
		for (int i=0; i<text.length(); i++) {
			char ch = text.charAt(i);
			if(i ==0 && 'a' <= ch && ch <= 'z' ) {
				ch -= 32;
			}
			answer += ch;  //i번째 글자를 answer에 순서대로 더한다
		}
		return answer;
	}
	
	static String substring(String text, int from, int to) {
		String answer = "";
		for (int i=from; i< to; i++) {
			char ch = text.charAt(i);
			answer += ch;
	}
		return answer;
		}
	
	public static void main(String[] args) {
		//1)두 정수의 덧셈을 반환하는 함수 add를 작성하세요
		int q1 = add(1,2);
		System.out.println("q1 : " + q1);
		
		//2)세 정수를 전달받아서 가장 작은 수를 반환하는 함수 getMinNumber를 작성하세요
		int q2 = getMinNumber(3,2,5);
		System.out.println("q2 : " +q2);
		
		//3)문자열 하나를 전달 받아서, 첫글자를 대문자로 변환하는 함수 upperCase를 작성하세요
		String q3 = upperCase("hello");
		System.out.println("q3 : "+ q3); 
		
		String t3 = upperCase("3 years later");
		System.out.println("t3 : "+ t3); 
		
		//4)문자열 하나와 정수 두 개를 전달받아서 문자열의 from 번째부터 to글자 이전까지의 글자를 잘라낸
		//새로운 문자열을 반환하는 함수 substring 을 작성하세요
		String q4 = substring("hello, world",0,5);
		System.out.println("q4 : " + q4); //hello
		
		String t4 = substring("hello, world",7,12);
		System.out.println("t4 : " + t4); //world
		
		
	}

}
