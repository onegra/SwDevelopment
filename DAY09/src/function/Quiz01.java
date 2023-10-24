package function;

public class Quiz01 {
	
	//1)
	static String getSign(int num1) {
		String a;
		if(num1 > 0) {
			a = "양수";
		}
		else if (num1 < 0) {
			a = "음수";
		}
		else {
			a = "0";
		}
		return a;
	}
	
	//2)
	static int getReverseNum(int num2) {
		int b = 0;
		while(num2 != 0) {
			b *=10;
			b += num2 % 10;
			num2 /= 10;
		}
		return b;
	}
	
	//3)
	static int pow(int n1, int n2) {
		int c = 1;
		for (int i = 0; i < n2; i++) { //n2번 반복해서 
			c*=n1;                 //n1을 곱한다
		}
		return c;
	}
	
	//4)
	static int remainder(int n1, int n2) {
		int answer = 0;
		answer = n1% n2;
		return answer;
	}
	
	//5)
	static String getReverseStr(String str) {
		String answer = "";
		for (int i = str.length()-1; i!= -1; i--) {
			answer += str.charAt(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		//1) 정수를 하나 전달받아서 양수 음수 0 을 문자열로 반환하는 함수 : getSign
		String q1 = getSign(5);
		System.out.println("q1 : " + q1);
		
		//2) 정수를 하나 전달받아서 정수의 배치를 거꾸로 뒤집어 반환하는 함수 : getReverseNum
		int q2 = getReverseNum(4321);
		System.out.println("q2 : " +q2);
		
		//3)두 정수를 전달받아서 n1의 n2제곱수를 반환하는 함수 : pow
		int q3 = pow(2,3);
		System.out.println("q3 : " +q3);
		
		//4)두 정수를 전달받아서 n1을 n2로 나누었을때의 나머지를 반환하는 함수 : remainder
		int q4 = remainder(100,6);
		System.out.println("q4 : " + q4);

		//5)문자열을 하나 전달받아서 문자열을 거꾸로 배치한 값을 반환하는 함수 : getReverseStr
		String q5 = getReverseStr("hello");
		System.out.println("q5 : "+ q5);
		
		//함수 호출 코드에 마우스를 올린 상태로 컨트롤 클릭하면 함수의 정의로 이동
		//int test = Integer.parseInt("1234");
		
	}

}
