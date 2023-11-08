package inheritance;
class Student2{
	String name;
	int score;
	
	public Student2(String name, int score) {
		this.name = name;
		this.score = score;
	}
	void show() {
		System.out.printf("이름 : %s, 점수 : %d\n",name,score);
	}
	@Override
	public String toString() {
		return String.format("이름 : %s, 점수 : %d\n",name,score);
	}
}
public class Ex09 {
	public static void main(String[] args) {
		Student2 ob = new Student2("이지은",99);
		ob.show();
		System.out.println(ob.toString());
		System.out.println(ob);
		
		Object ob2 = ob;
//		ob2.show(); //Object클래스에서는 show()메서드가 없어서 호출할 수 없다
		
		System.out.println(ob2.toString());
		//Object클래스에는 toString() 메서드가 있어서 호출 할 수 없다
		//오버라이딩했기 때문에 호출되고 나면 오버라이딩 한 내용대로 실행한다
		
	}

}
