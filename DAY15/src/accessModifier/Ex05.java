package accessModifier;

class Test5 {
	private String name;
	private int age;
	private static int count;
	
	public Test5(String name, int age) {
		this.name = name;
		this.age = age;
		count += 1;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static int getCount() {
		return count;
	}

	
	
	}
public class Ex05 {
	public static void main(String[] args) {
		
		System.out.println("Test5 타입의 객체 수 : " +Test5.getCount());
		
		Test5 ob1 = new Test5("이지은",30);
		Test5 ob2 = new Test5("홍진호",41);
		
		System.out.println("Test5 타입의 객체 수 : " +Test5.getCount());
		
		System.out.printf("%s : %d살\n",ob1.getName(),ob1.getAge());
		System.out.printf("%s : %d살\n",ob2.getName(),ob2.getAge());
		System.out.println("odd1.getCount() : " +ob1.getCount());
		System.out.println("odd2.getCount() : " +ob2.getCount());
	}

}
