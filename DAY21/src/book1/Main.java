package book1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 String name, author, publisher;
		 int price,menu;
		 
		 Book [] arr = new Book[10];
		 Scanner sc = new Scanner(System.in);
		 
		 MAIN : while(true) {
			 System.out.println("1. 목록");
			 System.out.println("2. 추가");
			 System.out.println("0. 종료");
			 System.out.println("메뉴 입력 >>> ");
			 menu = Integer.parseInt(sc.nextLine());
		 
		 switch(menu) {
		 case 1: 
			 for(int i = 0; i < arr.length; i++) {
				 if(arr[i] != null) {
					 System.out.printf("%s (%s-%s), %d원\n",arr[i].name,arr[i].author,arr[i].publisher,arr[i].price);
					 }
				 }
			 break; 
		 case 2:
			 System.out.println("도서 명");
			 name = sc.nextLine();
			 System.out.println("작가 명");
			 author = sc.nextLine();
			 System.out.println("출판사 명");
			 publisher = sc.nextLine();
			 System.out.println("가격");
			 price = Integer.parseInt(sc.nextLine());
			 
			 for(int i = 0; i < arr.length; i++) {
				 if(arr[i] == null) {
					 arr[i] = new Book();
					 arr[i].name = name;
					 arr[i].author = author;
					 arr[i].publisher = publisher;
					 arr[i].price = price;
					 break;
					 }
				 }
			 break;
		 case 0:
			 System.out.println("프로그램을 종료합니다");
			 break MAIN;
		 }
	}sc.close();
}
	}