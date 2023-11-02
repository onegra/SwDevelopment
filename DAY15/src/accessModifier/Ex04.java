package accessModifier;
class Test4 {
	int n1 = 10;
	static int n2 = 20;
	final int n3 = 30;
	static final int N4 = 40;
	//클래스를 제외한 모든 요소는 첫글자를 소문자로 작성하지만 static final필드는 예외적으로 모든 글자를 대문자로 작성한다
	//단어와 단어의 합성인 경우에는 언더바를 사용
	public int getN2() {
		return n1;
	}
}
public class Ex04 {
	public static void main(String[] args) {
		
		Test4 ob1 = new Test4();
		Test4 ob2 = new Test4();
		
		System.out.println("ob1.n2: "+ob1.n2);
		System.out.println("ob2.n2: "+ob2.n2);
		System.out.println();
		
		ob1.n2 += 5;
		
		System.out.println("ob1.n2: "+ob1.n2);
		System.out.println("ob2.n2: "+ob2.n2);
		System.out.println();
		
		System.out.println("Test4.n2 : " + Test4.n2 );
		System.out.println(Integer.MAX_VALUE);

	}
	

}
