package loop;

public class Ex03 {

	public static void main(String[] args) {
		int num = 0;
		while(num<5) {
			System.out.println(num);
			num++;
		}
		System.out.println();
		num = 0;
		while(true) {
			System.out.println(num);
			num++;
			if(num >= 5) {
				break;
			}
		}
		System.out.println();
		num = 0;
		while(true) {
			System.out.println(num);
			num++;
			if(num < 5) {
				break;
	}
		}}
}
