package abstraction;

abstract class Loop {
	abstract void loop();
	void info() {
		System.out.println("반복을 수행하는 클래스입니다");
	}
}
class NumberLoop extends Loop implements Runnable{
	@Override
	void loop() {
		for (int i = 1; i <= 25; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	@Override
	public void run() {
		loop();
	}
}
class AlphabetLoop extends Thread {
	@Override
	public void run() {
		for (char ch = 'A'; ch<='Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
	}
}
public class Ex08 {
	public static void main(String[] args) {
		NumberLoop ob1 = new NumberLoop();
		AlphabetLoop ob2 = new AlphabetLoop();
		Thread th = new Thread(ob1);
		//ob1.loop();
		//ob2.run();
		//ob2.start();
		//ob1.loop();
		

		th.start();
		ob2.start();
		
	}

}
