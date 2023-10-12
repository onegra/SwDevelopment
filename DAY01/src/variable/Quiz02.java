package variable;

public class Quiz02 {
	public static void main(String[] args) {
		//자신의 이름을 문자열 변수에 저장하세요
		String name = "강원지";
		
		//자신의 나이를 정수형 변수에 저장하세요
		int age1 = 24;
		Integer age2 = 24;
		
		//새로운 정수형 변수에 0을 대입하세요
		double num1 = 0; //우변의 0은 자료형이 명시되지 않은 리터럴이지만, 리터럴 정수의 기본자료형은 int이다
		//1# Double num2 = 0.0; //Type mismatch : cannot convert from int to Double
		//2# Double num2 = (double)0;
		Double num2 = Double.valueOf(0);
		
		//방금 만든 실수형 변수에 3.14를 대입하세요
		num1 = 3.14;
		num2 = 3.14;
	
		//지금까지 만든 3개 변수에 담긴 값을 각각 한줄씩 화면에 출력하세요
		System.out.println(name);
		System.out.println(age1);
		System.out.println(num1);
		System.out.println();
		
		//(primitive type을 이용해서 한번, Wrapper Class를 이용해서 한번 코드를 실행하세요)
		System.out.println(name);
		System.out.println(age2);
		System.out.println(num2);
		
	}
	

}
