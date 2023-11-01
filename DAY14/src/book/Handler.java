package book;

//1) 단일 데이터의 배열
//2) 데이터를 제어하기 위한 함수들

public class Handler {
	private Book[] arr = new Book[5];
	
	public int add(String title, String writer, int genre) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = new Book();
				arr[i].setTitle(title);
				arr[i].setWriter(writer);
				arr[i].setGenre(genre);
				row = 1;
				break;
			}
		}
		return row;
	}
	public void showList() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
			System.out.printf("책 : %s - %s, 장르 : %d\n",arr[i].getTitle(),arr[i].getWriter(),arr[i].getGenre());
			}
		}
	}

}
