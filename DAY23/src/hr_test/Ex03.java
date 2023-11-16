package hr_test;

import java.util.List;

public class Ex03 {
	public static void main(String[] args) {
		JdbcTemplate template = new JdbcTemplate();
		
		String sql ="select * from countries";
		
		RowMapper<Ex03DTO> mapper = (rs) -> {
			Ex03DTO dto = new Ex03DTO();
			dto.setCountry_id(rs.getString("country_id"));
			dto.setCountry_name(rs.getString("country_name"));
			dto.setRegion_id(rs.getInt("region_id"));
			return dto;
		};
		List<Ex03DTO> list = template.queryForList(sql, mapper);
		
		for(Ex03DTO ob : list) {
			System.out.printf("%s %s \t%d\n", ob.getCountry_id(),ob.getCountry_name(),ob.getRegion_id());
		}
		System.out.println("끝");
	}

}
