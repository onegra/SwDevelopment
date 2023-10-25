package function;

public class Ex04 {
	//원의 반지름을 전달받아서 원의 넓이를 반환하는 함수
	static double getCircleArea(int radius) {
		double area = radius * radius * 3.14;
		return area;
	}
	static double getCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area; 
	}
	public static void main(String[] args) {
		//함수 오버로딩 : 같은 이름의 함수에 여러 정의가 연결되어 있다
		//같은 이름으로 여러 함수가 중복정의 될 수 있다
		
		//예시1) 문자열의 substring 함수
		//인자를 1개만 전달하면 beginIndex로 취급하여 지정한 위치부터 끝까지 잘라낸다
		//인자를 2개 전달하면 beginIndex와 endIndex로 취급하여 begin부터 end이전까지 잘라낸다
		
		String text = "Authentication Nmber is 132675";
		String s1 = text.substring(15); //문자열을 잘라내고 싶다면 substring만 기억하면 된다
		String s2 = text.substring(15, 21);
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		double d1 = getCircleArea(3);
		double d2 = getCircleArea(2.2);
		
		System.out.printf("d1 : %.2f\n",d1);
		System.out.printf("d2 : %.2f\n",d2);
		
		//함수 오버로딩의 기준은 매개변수의 개수 및 자료형, 혹은 매개변수의 순서
		//반환자료형은 오버로딩에 전혀 영향을 줄 수 없다
	}

}
