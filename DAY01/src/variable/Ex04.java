package variable;

public class Ex04 {
	public static void main(String[] args) {
		//기본 자료형 (primitive type)
		//자바는 객체지향 언어이므로, 모든 값은 객체 형태로 나타내야한다.
		//이때 객체란, 데이터와 함수가 결합되어 있는 형태를 말한다
		//그러나 기본 자료형은 함수 없이 순수 데이터만으로 구성되어 있다
		//그래서 원시 자료형이라는 이름을 사용한다
		
		String name = "이지은";
		//첫 글자에 대문자를 넣는것 클래스뿐이다
		int age = 31;
		
		byte by = 127;
		boolean bo = true;
		short sh = 32767;
		char ch = 44032;
		long ln = 3000000000L; //기본자료형이 아니기 때문에 long임을 명시한다
		float fl = 1.2F;       //기본자료형이 아니기 때문에 float임을 명시한다
		double db = 3.14;
		
		//노란색 느낌표 혹은 줄이 생성되었을 때
		//the value of the local variable bo is not used
		//지역변수 bo는 아직 한번도 사용되지 않았습니다
		//변수는 나중에 값을 다시 사용하기 위해서 만드는건데 왜 한번도 안썼지? 라고 묻는 것이다
		
		System.out.println(name);
		System.out.println(by);
		System.out.println(bo);
		System.out.println(sh);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(ln);
		System.out.println(fl);
		System.out.println(db);
		System.out.println();
		
		//대입 : 오른쪽 값을 왼쪽 변수 공간에 복사하여 저장한다
		//왼쪽과 오른쪽의 값은 같지 않아도 되지만, 자료형은 같아야 한다
		// int num = "점심식사";
		
		//이미 선언된 변수는 자료형이 나타나지 않지만 툴팁이나 링크 따라가기 등으로 확인이 가능하다
		//age = "배고파";
		
		//양쪽 다 변수를 나타내고 있지만
		//오른쪽 변수는 변수에 담긴 책을 의미하고
		//왼쪽의 변수는 변수공간 그 자체를 의미한다		
		
		//왼쪽과 오른쪽의 자료형이 맞지 않아서 대입이 안되니, 자료형을 강제로 맞추면 대입이 된다
		//단, 이때 값의 보존 여부는 보장할 수 없다
		sh = (short)ch;
		System.out.println("sh :" +sh);
	}
}
