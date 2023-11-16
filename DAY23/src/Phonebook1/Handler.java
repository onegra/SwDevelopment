package Phonebook1;


import java.util.List;


public class Handler {
	//전체 목록
	public void showList(){
		PhonebookDAO dao = new PhonebookDAO();			
		List<PhonebookDTO> list = dao.selectList();	
		list.forEach(ob -> System.out.println(ob));
	}
	
	//추가
	public int insertPhonebook(PhonebookDTO ob) {
		int row = 0;
		PhonebookDAO dao = new PhonebookDAO();
		row = dao.insertPhonebook(ob);	
		return row;					
	}
	
	//전화번호 수정
	public int updatePnum(String name, String pnum) {
		int row = 0;
		PhonebookDAO dao = new PhonebookDAO();
		row = dao.updatePnum(name,pnum);
		return row;			
	}
	
	//즐겨찾기 수정
	public int updateFavorite(String name, String Favorite) {
		int row = 0;
		PhonebookDAO dao = new PhonebookDAO();
		row = dao.updateFavorite(name,Favorite);
		return row;	
		}	
		
	// 삭제
	public int deletePhonebook(String name) {
		int row = 0;
		PhonebookDAO dao = new PhonebookDAO();
		row = dao.deletePhonebook(name);
		return row;
	}

	
	

}
