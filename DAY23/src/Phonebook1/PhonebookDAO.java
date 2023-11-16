package Phonebook1;

import java.util.ArrayList;

public class PhonebookDAO {
	private JdbcTemplate template = new JdbcTemplate();
	
	//전체 목록 불러오기
	public ArrayList<PhonebookDTO> selectList() {
		String sql = "select * from phonebook order by favorite desc, name";
		//order by favorite desc, name : 리스트에서 즐겨찾기를 분류하고 이름순으로 출력한다
		
		RowMapper<PhonebookDTO> mapper = rs -> {
			PhonebookDTO dto = new PhonebookDTO();
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
			return dto;
		};
		
		return template.queryForList(sql, mapper);
	}
	
	//객체를 db로 저장하기
	public int insertPhonebook(PhonebookDTO dto) {
		int row = 0;
		String sql = "insert into Phonebook values (?, ?, ?, ?)";
		row = template.update(sql, dto.getName(), dto.getPnum(), dto.getAge(), dto.getFavorite());
		return row;
	}
	
	//전화번호 수정
	public int updatePnum(String name,String pnum) {
		int row = 0;
		String sql = "update phonebook set pnum = ? where name = ?";
		row = template.update(sql, pnum, name);
		return row;
	}
	
	//즐겨찾기 수정
		public int updateFavorite(String name,String favorite) {
			int row = 0;
			String sql = "update phonebook set favorite = decode(favorite, 'Y','N','N','Y') where name = ?";
			row = template.update(sql, name);
			return row;
		}
	
	//객체를 db에서 삭제하기
	public int deletePhonebook(String name) {
		int row = 0;
		String sql = "delete from phonebook where name = ?";
		//from은 생략당한거라 넣어도 가능
		row = template.update(sql, name);
		return row;
	}
}
