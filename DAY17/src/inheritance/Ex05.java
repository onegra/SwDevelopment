package inheritance;

class Parent5 { // 두 정수를 전달받아서 객체를 생성하고 덧샘식을 출력하는 클래스
	int n1, n2;
	
	public Parent5 (int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	public void show() {
		System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
	}
}
class Child5 extends Parent5 {
	int n3;
	Child5(int n1, int n2, int n3) {
		super (n1, n2);
		this.n3 = n3;
		
	}
	
	//생성자를 작성하여 필요한 코드를 작성하세요
	@Override
	public void show() {
		//세 정수를 전달 받고 세 정수의 덧셈식을 출력하는 기능을 오버라이딩하세요
		System.out.printf("%d + %d + %d = %d\n",n1,n2,n3,n1+n2+n3);
	}

	public void showMaxNum() {

		int max = 0;
		
		if(n1> n2 && n1 > n2) {
			max = n1;
		}
		if(n2> n1 && n2 > n3) {
			max = n2;
		}
		if(n3> n1 && n3 > n2) {
			max = n3;
		}
		System.out.printf("세 정수 중 가장 큰 정수는 : %d\n",max);
	}
	
	
	//세 정수 중 가장 큰 수를  출력하는 함수를 작성하세요
}
public class Ex05 {
	public static void main(String[] args) {
		Child5 ob = new Child5(12,7,25);
		ob.show();
		ob.showMaxNum();
		
		Parent5 ob1 = new Child5(1,2,3);
		Child5 ob2 = (Child5) ob1;
		System.out.println("ob1: " + ob1);
		System.out.println("ob2: " + ob2);
		System.out.println("ob1==ob2 " + (ob1==ob2));
		
		ob2.show();
		ob2.showMaxNum();
		
		ob1.show();
//		ob1.showMaxNum(); //ob1은 슈퍼클래스 타입이므로 오버라이팅 메서드가 실행된다 하지만 서프클래스의 메서드를 참조할 수 없다
		
	}

}
