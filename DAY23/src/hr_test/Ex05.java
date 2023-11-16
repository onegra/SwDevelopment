package hr_test;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String country_id = null;
		System.out.println("삭제할 국가 코드를 두 글자로 입력하세요 : ");
		country_id = sc.next();
		
		JdbcTemplate template= new JdbcTemplate();
		String sql = "delete from countries where country_id = ?";
		int row = template.update(sql, country_id);
		System.out.printf("%d 행이 삭제되었습니다\n",row);
		sc.close();
	}

}
