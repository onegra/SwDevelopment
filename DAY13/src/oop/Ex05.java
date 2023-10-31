package oop;

class PhoneBook {
	
	String name;
	int age;
	String PhoneNumber;
	
	void show() {
		String form = "%s (%d) : %s\n";
		System.out.printf(form, name, age, PhoneNumber);
	}
	//생성자 : 객체를 생성할 때 실행되는 함수이며, 클래스의 이름과 같은 이름을 사용하는 함수
	//생성자 정의에는 반환형 자체를 작성하지 않는다
	PhoneBook(String name, int age, String PhoneNumber) {
		this.name = name; //매개변수에 넘어온 값을 같은 이름의 맴버필드에 저장한다
		this.age = age;
		this.PhoneNumber = PhoneNumber;
	}
	//생성자를 오버로딩(중복정의)하며, 매개변수를 전달하지 않아도 객체를 생성할 수 있게한다
	PhoneBook() {}
}
public class Ex05 {
	public static void main(String[] args) {
		PhoneBook ob1 = new PhoneBook();
		PhoneBook ob2;
		
		//객체를 생성한 직후에는 객체 내부 맴버필드의 값이 0 혹은 null로 초기화되어있다
		System.out.println("ob1 name : "+ ob1.name);
		System.out.println("ob2 name :" + ob1.age);
		System.out.println("ob1.PhoneNumber : " + ob1.PhoneNumber);
		System.out.println();
		
		ob1.name = "이지은";
		ob1.age = 30;
		ob1.PhoneNumber = "010-1234-1234";
		
		ob1.show();
		
		ob2 = new PhoneBook();
		
		ob2.name = "홍진호";
		ob2.age = 41;
		ob2.PhoneNumber = "010-4321-4321";
		ob2.show();
		
		//클래스도 자료형이므로, 같은 자료형의 여러 데이터를 묶어서 처리하는 배열로 만들 수 있다
		PhoneBook[] arr = {ob1,ob2};
		System.out.println("\n배열로 출력하기");
		for (int i = 0; i<arr.length; i++) {
			arr[i].show();
		}
		System.out.println();
		
		//ob1과 ob2는 객체 생성 이후 필드에 값을 대입해서 사용한다
		//멤버 필드가 많고 대입할 내용이 많으면 코드가 길어지기 때문에
		//객체 생성과 동시에 값을 지정하는 방법이 있다
		//생성자를 호출하면서 필요한 값을 순서대로 전달하면 값이 준비된 객체가 생성될 수 있다
		
		PhoneBook ob3 = new PhoneBook("나단비", 5, "010-1212-1212");
		arr = new PhoneBook[] {ob1,ob2,ob3};
		
		System.out.println("\n새로운 배열로 다시 반복");
		for(PhoneBook ob : arr) {
			ob.show();
		}
		System.out.println();
	}

}
