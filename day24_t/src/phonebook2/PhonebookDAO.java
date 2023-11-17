package phonebook2;

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
	private String user = "c##itbank";
	private String password = "it";
	
	private Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public List<PhonebookDTO> selectList() throws Exception {
		ArrayList<PhonebookDTO> list = new ArrayList<>();
		String sql = "select * from phonebook order by favorite desc, name asc";
		
		conn = getConnection();
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			// RowMapper에 작성했던 규칙을 여기에 작성
			
//			list.add(dto);
		}
		rs.close();
		pstmt.close();
		conn.close();
		return list;
	}
}
