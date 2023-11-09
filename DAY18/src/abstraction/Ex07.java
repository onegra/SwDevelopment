package abstraction;

interface USB {
	void onConnect();
}
class WirelessReceiver extends Object implements USB{
	@Override
	public void onConnect() {
		System.out.println("무선장치가 연결되었습니다");
	}
}
class MemoryStick extends Object implements USB{
	@Override
	public void onConnect() {
		System.out.println("메모리 연결됨 64GB");
	}
}
class ElectricFan extends Object implements USB{
	@Override
	public void onConnect() {
		System.out.println("전원 충전 중...67%");
	}
}
class PC{
	void connect (USB ob) {
		ob.onConnect();
	}
}
public class Ex07 {
	public static void main(String[] args) {
		PC pc = new PC();
		ElectricFan fan = new ElectricFan(); 
		MemoryStick stick = new MemoryStick(); 
		WirelessReceiver receiver = new WirelessReceiver();
		pc.connect(fan);
		pc.connect(stick);
		pc.connect(receiver);
		
		USB mouse = () -> System.out.println("마우스 연결됨");
		pc.connect(mouse);
	}

}
