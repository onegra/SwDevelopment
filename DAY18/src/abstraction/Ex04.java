package abstraction;

abstract class Playable {
	String name;
	
	public Playable (String name) {
		this.name = name;
		
	}
	//캐릭터의 공격방식에 따라 서로 다른 형태의 출력문이 출력되어야 한다
	//현재 단계에서는 미구현 playable을 상속받는 각각의 클래스가 다른 내용을 가지게 한다
	//attack 메서드를 가지지않는 서브클래스는 존재하지 않는다
	public abstract void attack();
} 
class Warrior extends Playable {
	public Warrior (String name) {
		super (name);
	}
	@Override
	public void attack() {
		System.out.printf("%s가 검으로 적을 공격합니다\n",name);
	}
}

class Magician extends Playable {
	public Magician (String name) {
		super (name);
	}
	@Override
	public void attack() {
		System.out.printf("%s가 지팡이로 적을 공격합니다\n",name);
	}
}

class Soldier extends Playable {
	public Soldier (String name) {
		super (name);
	}
	@Override
	public void attack() {
		System.out.printf("%s가 AK-47로 적을 공격합니다\n",name);
	}
} 
public class Ex04 {
	public static void main(String[] args) {
		Playable ob1 = new Warrior("라인하르트");
		Playable ob2 = new Magician("모이라");
		Playable ob3 = new Soldier("애쉬");
		
		ob1.attack();
		ob2.attack();
		ob3.attack();
	}

}
