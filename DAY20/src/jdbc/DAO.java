package jdbc;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class DAO {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	private final String url= "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private final String password = "hr";
	private final String username = "hr";
	
	private final String drivername = "oracle.jdbc.driver.OracleDriver";
	
	public DAO() {
		try {
			Class.forName(drivername);
			conn = DriverManager.getConnection(url,username,password);
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름이 잘못되었습니다" + e);
		}catch (SQLException e) {
			System.out.println("DB에 접속하는데 문제가 발생했습니다 : " +e);
		}
	}
	public List<DTO> getqueryfromemployees() throws SQLException {
		ArrayList<DTO> list = new ArrayList<>();
		String sql = "select first_name, salary from employees"; 
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			DTO dto = new DTO();
			
			dto.setFirstName(rs.getString("first_name"));
			
			dto.setSalary(rs.getInt("salary"));
			
			list.add(dto);
			
		}
		
		rs.close();
		stmt.close();
		conn.close();
		return list;
	}
	public List<DTO> getqueryfromemployeesTop5() throws Exception {
		//데이터를 모아서 반환할 arraylist를 생성한다
		ArrayList<DTO> list = new ArrayList<>();
		//생성자에서 만들어진 conn에서 stmt를 받아온다
		stmt = conn.createStatement();
		//명령을 수행할 쿼리문 string sql에 작성한다
		String sql = "select first_name, salary from employees order by salary decs fetch first 5 rows only"; 
		//stmt 에서 sql을 전달하면서 실행하고 그 결과를 rs에 저장한다
		rs = stmt.executeQuery(sql);
		//반복문으로 rs에 담긴 내용을 dto객체로 옮겨담아서 리스트에 추가한다
		while(rs.next()) {
			DTO dto = new DTO();
			dto.setFirstName(rs.getString("first_name"));
			dto.setSalary(rs.getInt("salary"));
			list.add(dto); 
		}
		return list;
	}
}


