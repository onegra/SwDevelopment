package loop;

import java.io.File;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws Exception {
		String data = "";
		File f = new File("C:\\Windows\\System32\\drivers\\etc\\hosts");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()) {
			data += sc.nextLine() +"\n";
		}
		sc.close();
		
		System.out.println(data);
		//문제) data 변수에 들어있는 글자 중에서 대문자의 개수는 총 몇개일까요?
		String count ="";
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if('A' <=ch && ch<='Z') {
				count += ch;
			}
		}
		System.out.println(count.length());
		
		//위와 비슷한 구조의 숫자 문제
		//1에서 1000사이의 정수 중에서 13과 17의 공배수는 총 몇개인지 출력하세요
		int num = 0;
		for (int i = 1; i <= 1000; i++) {
			if(i % 13 == 0 && i % 17 == 0) {
				num += 1;
			}
		}
		System.out.println(num);
	}

}
