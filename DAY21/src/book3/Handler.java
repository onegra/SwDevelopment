package book3;
//데이터 저장소 (배열 -> 리스트 -> 파일 -> db)를 직접 참조하거나 연결할 수 있음
//프로그램의 주요 기능을 모아둔 클래스
public class Handler {
	
	private Book[] arr = new Book[10];
	//배열은 자료형에 맞는 0값으로 초기화된다
	//참조형 변수의 초기값은 null
	
	//배열을 전달받아서 배열 내부의 각 객체를 서식에 맞게 출력한다
	public void showList() {
		for(int i = 0; i < arr.length; i++) {
			 if(arr[i] != null) {
				 System.out.printf("%s (%s-%s), %d원\n",arr[i].getName(),arr[i].getAuthor(),arr[i].getPublisher(),arr[i].getPrice());
				 }
			 }
	}
	//도서 추가
	public int insertBook(Book ob) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = ob;
				row = 1;
				break;
				}
			}
		return row;
	}
	//도서 이름을 전달받아서 배열 안에서 일치하는 객체를 찾아서 삭제하는 함수
	int deleteBook(String name) {
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
}
