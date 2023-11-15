package book6;

import java.util.List;

public class Handler {
		
	// 배열을 전달받아서, 배열 내부의 각 객체를 서식에 맞게 출력하는 함수 (case 1)
	public void showList() {
		BookDAO dao = new BookDAO();
		List<BookDTO> list = dao.selectlist();
		list.forEach(ob -> System.out.println(ob));
	}
		
	// 도서 추가
	public int insertBook(BookDTO ob) {
		int row = 0; // true이면 row가 1, 아니면 row가 0
		BookDAO dao = new BookDAO();
		row = dao.insertBook(ob); //메인이 넘겨준 객체를 dao로 전달하여 추가한다
		return row; //추가 결과 정수를 다시 메인으로 변환한다
	}
	
	// 도서 이름을 전달받아서, 배열 안에서 일치하는 객체를 찾아서 삭제하는 함수
	public int deleteBook(String name) {
		int row = 0;
		return row;
	}
	
	
	
	
	
	
	
}
