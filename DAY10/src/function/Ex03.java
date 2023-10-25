package function;

public class Ex03 {
	//두 정수 중에서 가장 큰 수 반환하기
	static int getMAXMum(int n1, int n2) {
		int answer = 0;
		if (n1 > n2) {
			answer = n1;
		}
		if (n1 < n2) {
			answer = n2;
		}
		return answer; 
	}
	//3정수 중에서 가장 큰수 반환하기
	static int getMAXMum(int n1, int n2, int n3) {
		int answer = 0;
		if (n1 > n2 && n1 > n3) {
			answer = n1;
		}
		if (n2 > n1 && n2 > n3) {
			answer = n2;
		}
		if (n3 > n1 && n3 > n2) {
			answer = n3;
		}
		return answer;
	}
	
	//n개의 정수중에서 가장 큰 값을 반환하기
	static int getMAXMum(int...arr) {
		int answer = 0;
		for (int i = 0; i <arr.length; i++) {
			int num = arr[i];
			if (answer < num) {
				answer = num;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		int num1 = getMAXMum(10,20);
		int num2 = getMAXMum(10,20,30);
		int num3 = getMAXMum(1,2,10,20,40,8,-50);
		//자바에서는 매개변수의 개수가 다르거나 자료형이 다르면 함수명을 중복으로 정하는 것이 가능하다 (=오버로딩)
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2);
		System.out.println("num3 :"+num3);
	}

}
