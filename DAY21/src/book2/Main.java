package book2;

import java.util.Scanner;

public class Main {
	
	static void showList(Book[] arr) {
		for(int i = 0; i < arr.length; i++) {
			 if(arr[i] != null) {
				 System.out.printf("%s (%s-%s), %d원\n",arr[i].getName(),arr[i].getAuthor(),arr[i].getPublisher(),arr[i].getPrice());
				 }
			 }
	}
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
	//도서 이름을 전달받아서 배열 안에서 일치하는 객체를 찾아서 삭제하는 함수
	static int deleteBook(String name, Book[] arr) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getName().equals(name)) {
				arr[i] = null;
				row = 1;
				break;
			}
		}
		return row;
	}
	
	public static void main(String[] args) {
		Book book = null; 
		String name, author, publisher;
		int menu;
		int row = 0;
		Book [] arr = new Book[10];
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
			showList(arr);
			break; 
		case 2:
			book = getBookFromUserInput(sc);
			 
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == null) {
					arr[i] = book;
					break;
					}
				}
			break;
		case 3:
			System.out.print("검색어를 입력하세요 : ");
			name = sc.nextLine();
			row = deleteBook(name,arr);
			System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
			 break;
			 
		case 0:
			System.out.println("프로그램을 종료합니다");
			break MAIN;
		 }
	}
		sc.close();
}

	}