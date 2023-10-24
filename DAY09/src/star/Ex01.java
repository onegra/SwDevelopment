package star;

public interface Ex01 {
public static void main(String[] args) {

	for(int i = 0; i < 5; i++) {
		int num = 5 - i;
		for (int j = 0; j<num;j++) { //  5 4 3 2 1
			System.out.print(" ");
		}
		for (int j = 0; j<i;j++) { // 0 1 2 3 4
			System.out.print("#");
		}
		System.out.printf("%d, %d\n", num, i);
	}
	System.out.println();
}
}
