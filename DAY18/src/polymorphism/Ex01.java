package polymorphism;

class Animal{
	String name;
	Animal(String name) {
		this.name = name;
	} 
	void bark() {
		System.out.println(name+":...");
	}
}
class Dog extends Animal{
	Dog(String name) {
		super(name);
	}
	@Override
	void bark() {
		System.out.println(name+" : 멍멍");
	}
	void tailing() {
		System.out.println(name+"가 꼬리를 흔든다");
	}
}

class Cat extends Animal{
	Cat(String name) {
		super(name);
	}
	@Override
	void bark() {
		System.out.println(name+" : 야옹");
	}
	void play() {
		System.out.println(name+"가 혼자서 잘 논다");
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Dog ob1 = new Dog("강아지");
		Cat ob2 = new Cat("고양이");
		ob1.bark();
		ob2.bark();
		ob1.tailing();
		ob2.play();
		
		Animal a1 = ob1;
		Animal a2 = ob2;
		
		System.out.println(a1 == ob1);
		System.out.println(a2 == ob2);
		System.out.println(a1);
		System.out.println(ob1);
		System.out.println();
		System.out.println(a2);
		System.out.println(ob2);
		
		//a1과 ob1은 서로 동일한 대상을 참조하고 있다
		//다만 a1의 자료형은 Animal이고 ob1의 자료형은 Cat이다
		//a1으로 참조하면 Animal 클래스에 작성된 내용만 참조할 수 있고
		//ob1으로 참조하면 Cat클래스에 작성된 내용까지 모두 참조할 수 있다
		
		//a1.play();
		//a2.tailing()
		//Animal클래스에는 play나 tailing이 없다 cat과 dag의 고유기능이기 때문
		
		a1.bark();
		a2.bark();
		//슈퍼클래스 Animal 에는 name+ ":..."으로 정의되어 있으나 각 서브클래스의 오버라이딩 내용으로 실행된다
		
//		Animal[] arr = {a1,a2}; 이것도 가능
		Animal[] arr = {ob1,ob2};
		
		for(int i = 0; i < arr.length; i++) {
			String className = arr[i].getClass().getSimpleName();
			System.out.println("arr[i]의 클래스이름 : " + className);
	//		arr[i].play(); cat의 고유메서드이므로 실행안됨 tailing()도 마찬가지!
			arr[i].bark();
			
			switch(className) {
			case "Cat":
				Cat tmp1 = (Cat) arr[i];
				tmp1.play();
				break;
			case "Dog":
				Dog tmp2 = (Dog) arr[i];
				tmp2.tailing();
				break;
			}
			//업 캐스팅 된 객체를 원래대로 돌리기 위해 다운캐스팅 하기위해 확인작업이 필요하다
			if (arr[i] instanceof Cat) {
				Cat tmp1 = (Cat) arr[i];
				tmp1.play();
				}
			if (arr[i] instanceof Dog) {
				Dog tmp2 = (Dog) arr[i];
				tmp2.tailing();
				}
			
			
		}
	}

}
