package book5;

import java.util.Scanner;

public class Main {
	
	
	static Book getBookFromUserInput(Scanner sc) {
		Book book = new Book();
		System.out.println("도서 명");
		String name, author, publisher;
		 int price; 
		 
		 name = sc.nextLine();
		 System.out.println("작가 명");
		 author = sc.nextLine();
		 System.out.println("출판사 명");
		 publisher = sc.nextLine();
		 System.out.println("가격");
		 price = Integer.parseInt(sc.nextLine());
		 
		 book.setName(name);
		 book.setAuthor(author);
		 book.setPublisher(publisher);
		 book.setPrice(price);
		 return book;
	}
	
	public static void main(String[] args) {
		Handler handler = new Handler();
		Book book = null; 
		String name;
		int menu;
		int row = 0;
		Scanner sc = new Scanner(System.in);
		 
		MAIN : while(true) {
			System.out.println("1. 목록");
			System.out.println("2. 추가");
			System.out.println("3. 삭제");
			System.out.println("0. 종료");
			System.out.println("메뉴 입력 >>> ");
			menu = Integer.parseInt(sc.nextLine());
		 
		switch(menu) {
		case 1: 
			handler.showList();
			break; 
		
		case 2:
			book = getBookFromUserInput(sc);
			row = handler.insertBook(book);
			System.out.println(row != 0 ? "추가 성공" : "추가 실패");
			break;
			
		case 3:
			System.out.print("검색어를 입력하세요 : ");
			name = sc.nextLine();
			row = handler.deleteBook(name);
			System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
			 break;
			 
		case 0:
			handler.save();
			break MAIN;
		 }
	}
		sc.close();
}

	}