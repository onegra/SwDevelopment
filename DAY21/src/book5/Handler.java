package book5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

//데이터 저장소 (배열 -> 리스트 -> 파일 -> db)를 직접 참조하거나 연결할 수 있음
//프로그램의 주요 기능을 모아둔 클래스
public class Handler {
	
	//배열은 자료형에 맞는 0값으로 초기화된다
	//참조형 변수의 초기값은 null
	
	private ArrayList<Book> list = new ArrayList<>();
	//배열을 전달받아서 배열 내부의 각 객체를 서식에 맞게 출력하는 함수(case 1)
	
	private File f = new File("bookList.csv");
	
	public Handler() {
		if(f.exists() == false) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("");
				e.printStackTrace();
			}
		}
	}
	public void save() {
		try {
			FileOutputStream fos = new FileOutputStream(f);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			
			osw.write("/ufeff");
			
			for(Book ob : list) {
				String name = ob.getName();
				String author = ob.getAuthor();
				String publisher = ob.getPublisher();
				String price = String.valueOf(ob.getPrice());
				
				String data = String.format("%s (%s, %s), %s원\n", name,author,publisher,price );
				osw.write(data);
				osw.write('\n');
			}
			osw.flush();
			osw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showList() {
		//1)index를 사용하는 for문
		for(int i = 0; i < list.size(); i++) {
			Book ob = list.get(i);
			 System.out.println(ob);
			 }
	}
	
	//도서 추가
	public int insertBook(Book ob) {
		int row = 0;
		
		boolean flag = list.add(ob);
		row = flag ? 1 : 0;
		return row;
	}
	//도서 이름을 전달받아서 배열 안에서 일치하는 객체를 찾아서 삭제하는 함수
	int deleteBook(String name) {
		int row = 0;
		boolean flag = list.removeIf(ob -> ob.getName().equals(name));
		row = flag ? 1 : 0;
		return row;
	}
}
