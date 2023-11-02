package accessModifier;

class Test1  {
	private int n1 = 10;
	int n2 = 20;
	protected int n3 = 30;
	public int n4 = 40;
	
	public int getN1() {
		return n1;
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Test1 ob = new Test1();
		System.out.println("ob.n1 :" + ob.getN1());
		System.out.println("ob.n2 :" + ob.n2);
		System.out.println("ob.n3 :" + ob.n3);
		System.out.println("ob.n4 :" + ob.n4);
		System.out.println();
	}

}
