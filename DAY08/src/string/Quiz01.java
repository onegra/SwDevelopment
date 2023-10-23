package string;

public class Quiz01 {
	public static void main(String[] args) {
		//주어진 문자열에서 알파벳만 가져와서 새로 구성된 문자열 s2를 출력하세요
		String s1 = "a1B2c3D4e5";
		
		 char[] arr= s1.toCharArray();
		
		for(int i = 0; i< arr.length; i++) {
			char s2 =arr[i];
			if( 'A' <= s2 && s2 <='z' ) {
				System.out.print(s2);
			}
		}
		
		/*
		String s2 =""; //정수 덧셈에 대한 항등원이 0이라면 문자열 덧셈에 대한 항등원은 ""이다 (아무것도 더하지 않았을때의 값)
		for(int i = 0; i< s1.length(); i++) { //전체 글자중에서 
			char ch =s1.charAt(i); //각 글자를 ch라고 할 때
			if( 'a' <= ch && ch <='z' || 'A' <= ch && ch <='Z' ) { //ch가 조건을 만족하면
				s2 += ch;
			}
		}
		System.out.print(s2);
			
			*/
		}

}
