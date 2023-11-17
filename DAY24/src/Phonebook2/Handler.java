package Phonebook2;

import java.util.List;

public class Handler {
	private PhonebookDAO dao = new PhonebookDAO();
	//private을 입력받고 public을 받는 순으로 사용하는 것이 좋음
	
	//전체 목록
	public void showList(){			
		List<PhonebookDTO> list = null;
		try {
			list = dao.selectList();
		} catch (Exception e) {
			e.printStackTrace();
		}	
		list.forEach(ob -> System.out.println(ob));
	}
	
	//추가
	public int insertPhonebook(PhonebookDTO ob) throws Exception {
		int row = 0;
		row = dao.insertPhonebook(ob);	
		return row;					
	}
	
	//전화번호 수정
	public int updatePnum(int idx, String pnum) throws Exception {
		int row = 0;
		row = dao.updatePnum(idx,pnum);
		return row;			
	}
	
	//즐겨찾기 수정
	public int updateFavorite(int idx, String Favorite) throws Exception {
		int row = 0;
		row = dao.updateFavorite(idx,Favorite);
		return row;	
		}	
		
	// 삭제
	public int deletePhonebook(int idx) throws Exception {
		int row = 0;
		row = dao.deletePhonebook(idx);
		return row;
	}

	
	

}
