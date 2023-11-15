package book6;

import java.sql.*;
import java.util.ArrayList;

import oracle.jdbc.driver.OracleDriver;

public class BookDAO {
	private Connection conn;
	//private Statement stmt;
	private PreparedStatement pstmt; //statement의 서브클래스(상속) pstmt
	private ResultSet rs;
	
	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String username = "c##itbank";
	private String password= "it";
	
	public BookDAO() {
		try {
			Class.forName("OracleDriver.");
			conn = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			System.out.println("SQL 접속 예외 : " + e);
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 불러올 수 없습니다 : "+e);
			e.printStackTrace();
		}  
	}
	public ArrayList<BookDTO> selectlist(){
		ArrayList<BookDTO> list = new ArrayList<>();
		String sql = "select * from book";
		try{
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BookDTO dto = new BookDTO();
				dto.setAuthor(rs.getString("author"));
				dto.setName(rs.getString("name"));
				dto.setPrice(rs.getInt("price"));
				dto.setPublisher(rs.getString("publisher"));
				list.add(dto);
			}
			} catch (SQLException e) {
				System.out.println("예외발생 : "+e);
				e.printStackTrace();
			} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null)pstmt.close();
					if(conn != null)conn.close();
				} catch(SQLException e) {}
			}
		return list;
	}
	
	public int insertBook(BookDTO dto) {
		int row = 0;
//		String sql = "insert into book valus ('" + dto.getName() +"')";
//		쿼리문에 내가 값을 입력해야 하는 내용이 많으면 따옴표 처리 및 자료형 처리가 불편해진다
		//기존의 Statement는 이런 기능이 없어서 preparedStratement를 이용하면 순서대로 값을 넣을 수 있는데사용하는 형식은 printf()와 유사하다
		String sql = "insert into book values (?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAuthor());
			pstmt.setString(3, dto.getPublisher());
			pstmt.setInt(4, dto.getPrice());
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insertBook 예외 발생 : " + e);
			e.printStackTrace();
		} finally {
			try {
			if (rs != null) rs.close();
			if (pstmt != null)pstmt.close();
			if(conn != null)conn.close();
		} catch (SQLException e) {}
		}
		return row;
	}
	public int deleteBook(String name) {
		int row = 0;
		String sql = "delete book where name = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			row = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
			if (rs != null) rs.close();
			if (pstmt != null)pstmt.close();
			if(conn != null)conn.close();
		} catch (SQLException e) {}
		}
		return row;
	}

}
