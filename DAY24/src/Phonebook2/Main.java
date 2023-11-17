package Phonebook2;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	static PhonebookDTO getPhonebookFromUserInput(Scanner sc) {
		PhonebookDTO phone = new PhonebookDTO();
		String name, pnum, favorite;
		int age, idx;	
		

		System.out.print("아이디 : ");
		idx = Integer.parseInt(sc.nextLine());
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("전화번호 : ");
		pnum = sc.nextLine();
		
		System.out.print("즐겨찾기 여부 : ");
		favorite = sc.nextLine();
		
		System.out.print("나이 : ");
		age = Integer.parseInt(sc.nextLine());
		
		phone.setIdx(idx);
		phone.setName(name);
		phone.setPnum(pnum);
		phone.setAge(age);
		phone.setFavorite(favorite);
		return phone;
	}
		
	public static void main(String[] args) throws Exception {
		Handler handler = new Handler();
		PhonebookDTO phone = null;
		Scanner sc = new Scanner(System.in);
		int menu = -1;
		int row = 0;
		int idx = 0;
		String name, pnum, favorite;
		List<PhonebookDTO> list = null;
		
		while(menu != 0) {
			System.out.println("메뉴출력");
			System.out.println("1. 전체 목록");
			System.out.println("2. 추가");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 즐겨찾기 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				handler.showList();
				break;
			case 2:
				phone = getPhonebookFromUserInput(sc);
				row = handler.insertPhonebook(phone);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
			case 3:
				System.out.println("아이디를 입력하세요 : ");
				idx = sc.nextInt();
				System.out.println("수정할 전화번호를 입력하세요 :");
				pnum = sc.nextLine();
				row = handler.updatePnum(idx, pnum);
				System.out.println(row != 0 ? "수정 성공" : "수정 실패");
				break;
			case 4:
				System.out.println("아이디를 입력하세요 : ");
				idx = sc.nextInt();
				System.out.println("수정할 즐겨찾기를 입력하세요 :");
				favorite = sc.nextLine();
				row = handler.updateFavorite(idx, favorite);
				System.out.println(row != 0 ? "수정 성공" : "수정 실패");
				break;
			case 5:
				System.out.print("삭제할 아이디를 입력하세요 : ");
				idx = sc.nextInt();
				row = handler.deletePhonebook(idx);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
			case 0:
				System.out.println("프로그램을 종료합니다");
				break;
			
			}
		} //end of while
		sc.close();
		
	}

}
