package Phonebook2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhonebookDAO {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String username = "c##itbank";
	private String password = "it";
	
	private Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,username,password);
		return conn;
	}
	
	public int update(String sql, Object... args) throws Exception {
		int seq = 0;
		int row = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			for(int i = 0; i < args.length; i++) {
				switch(args[i].getClass().getName()) {
				case "java.lang.Integer":
					pstmt.setInt(++seq, Integer.parseInt(args[i].toString()));
					break;
				default:
					pstmt.setString(++seq, args[i].toString());
				}
			}
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {		
			try {
				if(rs != null) rs.close();	
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(SQLException e) {}
		}
		return row;
		
	}
	public List<PhonebookDTO> selectList() throws Exception {
		ArrayList<PhonebookDTO> list = new ArrayList<>();
		String sql = "select * from phonebook order by favorite desc, name";
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			PhonebookDTO dto = new PhonebookDTO();
			dto.setIdx(rs.getInt("idx"));
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
		list.add(dto);
		}
		rs.close();
		pstmt.close();
		conn.close();
		return list;
	}

	//객체를 db로 저장하기
	public int insertPhonebook(PhonebookDTO dto) throws Exception {
		int row = 0;
		String sql = "insert into phonebook values (?, ?, ?, ?, ?)";
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		row = update(sql,dto.getIdx(), dto.getName(), dto.getPnum(), dto.getAge(), dto.getFavorite());
		return row;
	}
	

	//전화번호 수정
	public int updatePnum(int idx,String pnum) throws Exception {
		int row = 0;
		String sql = "update phonebook set pnum = ? where idx = ?";
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idx);
		row = pstmt.executeUpdate();
		rs.close();
		pstmt.close();
		conn.close();
		return row;
	}
	
	//즐겨찾기 수정
		public int updateFavorite(int idx,String favorite) throws Exception {
			int row = 0;
			String sql = "update phonebook set favorite = decode(favorite, 'Y','N','N','Y') where idx = ?";
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			row = pstmt.executeUpdate();
			rs.close();
			pstmt.close();
			conn.close();
			return row;
		}
	
	//객체를 db에서 삭제하기
	public int deletePhonebook(int idx) throws Exception {
		int row = 0;		
		String sql = "delete from phonebook where idx = ?";
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idx);
		row = pstmt.executeUpdate();
		rs.close();
		pstmt.close();
		conn.close();;
		return row;
	}
}
