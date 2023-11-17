package phonebook2;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int menu = -1;
		Handler handler = new Handler();
		List<PhonebookDTO> list = null;
		PhonebookDTO ob = null;
		int idx;
		String name;
		
		while(menu != 0) {
			System.out.println("1. 전체목록");
			System.out.println("2. 추가");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 즐겨찾기 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.print("입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 0: break;
			}
			System.out.println();
		}
		sc.close();
	}
}
