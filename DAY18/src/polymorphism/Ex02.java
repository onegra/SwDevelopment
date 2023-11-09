package polymorphism;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Human {
	String name;
	public Human (String name) {
		this.name = name;
	}
	void info() {
		System.out.println("이름: "+name);
	}
}
class Doctor extends Human {
	private final String job = "의사";
	Doctor(String name) {
		super(name);
	}
	@Override
	void info() {
		System.out.printf("이름: %s, 직업: %s\n",name,job);
	}
	void cure(Human patient) {
		System.out.printf("%s가 %s에게 응급처치를 시행합니다\n",name,patient.name
				);
	}
}
class Singer extends Human {
	private final String job = "가수";
	
	Singer(String name) {
		super(name);
	}
	@Override
	void info() {
		System.out.printf("이름: %s, 직업: %s\n",name,job);
	}
}
class Actor extends Human {
	private final String job = "배우";
	Actor(String name) {
		super(name);
	}
	@Override
	void info() {
		System.out.printf("이름: %s, 직업: %s\n",name,job);
	}
}

class Airplane {
	private Human[] seat = new Human[4];
	public boolean entrance(Human guest) {
		boolean result = false;
		for(int i = 0; i < seat.length; i++) {
			if(seat[i] == null) {
				seat[i] = guest;
				result = true;
				break;
			}
		}
		return result;
	}
	public void simulationEmergency(int index) {
		System.out.println(seat[index].name + " 손님이 배가 아픕니다");
		System.out.println("의사를 먼저 찾아야합니다");
		System.out.println("의사를 찾아서 cure메서드를 호출하세요");
		System.out.println("인자로 환자를 전달하면 됩니다");
		//여기 아래 이후 코드를 작성하세요
		//의사가 있는지 없는지 먼저 판별
		Doctor tmp = null;
		for (int i = 0; i < seat.length; i++) {
			if(seat[i] instanceof Doctor) {
				tmp = (Doctor) seat[i];
			}
		}
		if (tmp ==null) {
			System.out.println("의사가 없습니다");
		}
		else if(tmp == seat[index]) {
			System.out.println("자기자신을 치료할 수는 없습니다");
		}
		else {
			tmp.cure(seat[index]);
		}
		//의사가 없으면 없다고 출력
		
		//있으면 의사의 cure메서드를 호출하면서 환자 객체를 전달
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Airplane air = new Airplane();
		Doctor ob1 = new Doctor("이익준");
		Singer ob2 = new Singer("차은우");
		Actor ob3 = new Actor("강동원");
		Human ob4 = new Human("신유진");
		Human ob5 = new Human("왕제은");
		
		Human[] queue = {ob1,ob2,ob3,ob4,ob5};
		List<Human> list =Arrays.asList(queue);
		Collections.shuffle(list);
		list.toArray(queue);
		
		for(int i = 0; i < queue.length; i++) {
			//queue[i].info();
			boolean flag = air.entrance(queue[i]);
			System.out.printf("%s : 탑승 %s\n",queue[i].name,flag ? "성공" : "실패");
		}
		System.out.println();
		air.simulationEmergency(1);
	}

}
