package accessModifier;
class Message {
	private String name;
	private String Message;
	
	public Message(String name) {
		this.name = name;
	}
	void sendMessage(Message other, String message) {
		other.receieveMessage(this, message);
	}
	void receieveMessage(Message sender, String message) {
		System.out.printf("=== %s의 화면 ===\n",this.name);
		System.out.printf("%s : %s\n",sender.name, message);
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Message ob1 = new Message("짱구");
		Message ob2 = new Message("유리");
		
		ob1.sendMessage(ob2, "유리야 안녕");
		ob2.sendMessage(ob1, "안녕 짱구야, 소꿉놀이 하러갈래?");
	}

}
