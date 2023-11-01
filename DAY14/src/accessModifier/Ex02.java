package accessModifier;

public class Ex02 {
	public static void main(String[] args) {
		Human ob1 = new Human();
		ob1.setName("이지은");
		ob1.setAge(30);
		
		System.out.println("이름 : " + ob1.getName());
		System.out.println("나이 : " + ob1.getAge());
		
	}

}
