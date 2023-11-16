package hr_test;

import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		JdbcTemplate template = new JdbcTemplate();
		String sql = "select tname from tab";
		
		RowMapper<String> mapper = (rs) -> {
			return rs.getString("tname");
		};
	List<String> tableNameList = template.queryForList(sql, mapper);
	tableNameList.forEach(System.out::println);
	}

}
	
