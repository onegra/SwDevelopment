package string;

import java.util.Scanner;

class Solution {
    public String solution(String new_id) {//들어오는 값, 인자
        String answer = "";
     
        //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        new_id = new_id.toLowerCase();
        
        //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
       for(int i = 0; i<new_id.length(); i++) {
			char ch = new_id.charAt(i);
			if( 'a' <= ch && ch <='z' ) {
				answer += ch;
			}
			else if ( '0' <= ch && ch <='9' ) {
				answer += ch;
			}
			else if(ch == '-'|| ch=='_'||ch == '.') {
				answer += ch;
			}
       }
        
        //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
			while(answer.contains("..")) { 
				answer = answer.replace("..","."); 
			}
			
        //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다. 처음'이나'이므로 or연산자 사용
			if(answer.startsWith(".")) {
				answer = answer.substring(1);	
			}
			if(answer.endsWith(".")) {
				answer = answer.substring(0,answer.length() -1);	
			}
        //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
			if(answer.equals("")) { //리터럴과 변수의 비교는 리터럴을 앞에 세우는 것이 좋다
				answer = "a";
			}
			
        //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
         if (answer.length() >= 16) {
        	 answer = answer.substring(0,15);
         }
         if(answer.endsWith(".")) {
				answer = answer.substring(0,answer.length() -1);	
			}
         
         //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
         while(answer.length() < 3) {
    	   answer += answer.charAt(answer.length()-1);
       }
         
         System.out.println(answer);
        return answer; //함수가 종료되면서 마지막에 내놓는 값 (돌려주는 값, 반환 값)
    }
}

public class Quiz02 {
	public static void main(String[] args) {
		String[] inputs = {
				"...!@BaT#*..y.abcdefghijklm",
				"z-+.^.",
				"=.=",
				"123_.def",
				"abcdefghijklmn.p"
		};
		String[] outputs = { //제시되는 기대값들
				"bat.y.abcdefghi",
				"z--",
				"aaa",
				"123_.def",
				"abcdefghijklmn"
		};
		Solution solution = new Solution();
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<inputs.length; i++) {
			String new_id = inputs[i];
			String output = outputs[i];
			String answer = solution.solution(new_id);
			System.out.printf("%d) %s\n", i + 1, answer.equals(output));
		}
	System.out.println("테스트끝");
}

}

