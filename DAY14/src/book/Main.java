package book;

import java.util.Scanner;

import book.Handler;

//사용자와 상호작용(입출력)
//입력값에 따라서 handler의 함수를 출력
// 책 분류 
// 이름, 번호, 장르
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Handler hl = new Handler();
		String title;
		int booknumber;
		String writer;
		int genre;
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 종료");
			System.out.println("선택>>>");
			
			menu = sc.nextInt();
			switch(menu) {
			case 1: 
				System.out.println("책 제목 : ");
				title = sc.next();
				System.out.println("작가 : ");
				writer = sc.next();
				System.out.println("장르번호 : ");
				genre = sc.nextInt();
				row = handler.add(title, writer, genre); //입력값을 받아서 넘기면 handler가 알아서 처리하고 그 결과만 main()에게 보고한다
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
			case 2: 
				handler.showList();
				break;
			case 0:
				sc.close();
				return;
			default: 
				System.out.println("잘못 선택하셨습니다");
			}
			System.out.println();
		}
	}
	}

}
