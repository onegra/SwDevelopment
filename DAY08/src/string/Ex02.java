package string;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "hello";
		String s2 = "hello";
		String s3;
		
		System.out.println("hello라고 입력하세요");
		s3 = sc.next();
		
		System.out.println("s1==s2: " + (s1 == s2));
		System.out.println("s2==s3: " + (s2 == s3));
		System.out.println("s1==s3: " + (s1 == s3));
		System.out.println();
		
		System.out.println("s1.eqauls(s2): " + (s1.equals(s2)));
		System.out.println("s2.eqauls(s3): " + (s2.equals(s3)));
		System.out.println("s1.eqauls(s3): " + (s1.equals(s3)));
		System.out.println();
		
		//문자열의 내용비교
		//1)A.equals(B) : A와 B의 내용이 정확히 일치하는가
		//2)A.startsWith(B) : A문자열이 B내용으로 시작하는가 (접두사 체크)
		//3)A.endsWith(B) : A문자열이 B내용으로 끝나는가 (접미사 체크)
		//4)A.contains(B) : A문자열이 B내용을 포함하는가 (검색어 포함)
		
		System.out.println("s1.starWish(\"he\")" + (s1.startsWith("he")));
		System.out.println("s1.endWish(\"lo\")" + (s1.endsWith("lo")));
		System.out.println("s1.contains(\"el\")" + (s1.contains("el")));
		sc.close();
		
	}

}
