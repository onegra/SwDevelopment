package book4;

import java.util.ArrayList;

//데이터 저장소 (배열 -> 리스트 -> 파일 -> db)를 직접 참조하거나 연결할 수 있음
//프로그램의 주요 기능을 모아둔 클래스
public class Handler {
	
	//배열은 자료형에 맞는 0값으로 초기화된다
	//참조형 변수의 초기값은 null
	
	private ArrayList<Book> list = new ArrayList<>();
	//배열을 전달받아서 배열 내부의 각 객체를 서식에 맞게 출력하는 함수(case 1)
	
	public void showList() {
		//1)index를 사용하는 for문
		for(int i = 0; i < list.size(); i++) {
			Book ob = list.get(i);
			 System.out.println(ob);
			 }
		
		//2) 향상된 for문 (index를 사용하지 않음)
		//for(Book ob : list) {
		//	System.out.println(ob);
		//}
		//3) 람다식 + 컬렉션 forEah()
		//list.forEach(ob -> System.out.println(ob));
		
		//4) 메서드 참조
		//list.forEach(System.out::println);
	} //4개중 하나만 사용
	
	//도서 추가
	public int insertBook(Book ob) {
		int row = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == null) {
//				arr[i] = ob;
//				row = 1;
//				break;
//				}
//			}
		boolean flag = list.add(ob);
		row = flag ? 1 : 0;
		return row;
	}
	//도서 이름을 전달받아서 배열 안에서 일치하는 객체를 찾아서 삭제하는 함수
	int deleteBook(String name) {
		int row = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] != null && arr[i].getName().equals(name)) {
//				arr[i] = null;
//				row = 1;
//				break;
//			}
//		}
		boolean flag = list.removeIf(ob -> ob.getName().equals(name));
		row = flag ? 1 : 0;
		return row;
	}
}
