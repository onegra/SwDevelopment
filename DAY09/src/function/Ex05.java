package function;

public class Ex05 {
	//main에서 객체 없이 바로 호출하는 함수 앞에는 static을 붙여주면 된다
	
	static int getBigNumber(int num1, int num2) {
		int big = num1 > num2 ? num1 : num2;
		return big;
	}
	//함수의 입력과 출력
	//함수의 생산과 소비
	
	public static void main(String[] args) {
		int n1 =3, n2 = 5;
		int n3 = getBigNumber(n1, n2);
		System.out.printf("%d, %d중에서 큰수는 %d입니다",n1,n2,n3);
	}

}
