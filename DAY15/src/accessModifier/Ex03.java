package accessModifier;
class Test3 {
	int n1 = 10;
	final int n2 = 20;
	
	private final int n3;
	
	public Test3 () {
		n3 = 0;
	}
	public Test3(int n3) {
		this.n3 = n3;
	}
	public int getN3() {
		return n3;
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Test3 ob1 = new Test3();
		ob1.n1 = 30;
		
		Test3 ob2 = new Test3(35);
		System.out.println("ob2.n1 : " + ob2.n1);
		System.out.println("ob2.n2 : " + ob2.n2);
		System.out.println("ob2.n3 : " + ob2.getN3());
		System.out.println();
		
		Test3 ob3 = new Test3(75);
		System.out.println("ob3.n1 : " + ob3.n1);
		System.out.println("ob3.n2 : " + ob3.n2);
		System.out.println("ob3.n3 : " + ob3.getN3());
		System.out.println();
	}

}
