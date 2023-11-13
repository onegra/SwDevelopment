package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Ex08 {
	public static void main(String[] args) throws Exception {
		String username = "hr";
		String password = "hr";
		String url = "jbdc:oracle:thin:@192.168.1.100:1521:xe";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		conn = DriverManager.getConnection(url,username,password);
		
		stmt = conn.createStatement();
		
		String sql = "select first_name, salary from employees order by salary desc";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			String firstName = rs.getString("first_name");
			int salary = rs.getInt("salary");
			System.out.printf("%s : $%,d\n",firstName,salary);
		}
		System.out.println("출력 끝");
		
		rs.close();
		stmt.close();
		conn.close();
	}

}
