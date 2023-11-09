package abstraction;

public class Ex05 {
	public static void main(String[] args) {
		Playable ob = new Playable("마리오") {
			@Override
			public void attack() {
				System.out.printf("%s가 적을 밞아서 공격합니다\n",name);
			}
		};
		ob.attack();
	}

}
