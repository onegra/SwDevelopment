package date;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

class EmployeesDTO{
	String first_name;
	Date hire_date;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date date) {
		this.hire_date = date;
	}
}

public class Ex05 { //기초 연습용
	public static void main(String[] args) throws Exception {
		//hr계정의 employees 테이블에서 first_name 과 hire_date만 지정하여
		//DTO혹은 Hashmap에 저장하여 리스트로 가져온 후 출력하세요
		ArrayList<EmployeesDTO> list = new ArrayList<>();
		
		//1)접속할 주소, 계정, 비밀번호 설정
		String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
		String user = "hr";
		String password = "hr";
		
		//2)드라이버 불러오기
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//3)sql 준비
		String sql = "select first_name, hire_date from employees";
		
		//4)연결 conn
		Connection conn = DriverManager.getConnection(url, user, password);
		
		//5)상태 (실행준비, pstmt)
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		//6)결과 (pstmt.excuteQuery())
		ResultSet rs = pstmt.executeQuery();
		
		//7)while(rs.next())
		while(rs.next()) {
			//8)불러온 값을 자바 객체에 저장 (dto 혹은 hashmap)
			EmployeesDTO dto = new EmployeesDTO();
			dto.setFirst_name(rs.getString("first_name"));
			dto.setHire_date(rs.getDate("hire_date"));
			//9)리스트에 하나씩 추가
			list.add(dto);
		}
	
		//10)반복문이 끝나면 리스트의 내용을 출력하기
		list.forEach(ob -> System.out.printf("%s : %s\n",ob.getFirst_name(),ob.getHire_date()));
		rs.close();
		pstmt.close();
		conn.close();

	}

}
