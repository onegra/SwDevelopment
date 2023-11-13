package jdbc;

import java.util.List;

public class Ex10 {
	public static void main(String[] args) throws Exception {
		DAO dao = new DAO();
		List<DTO> list = dao.getqueryfromemployeesTop5();
		
		for(DTO dto : list) {
			System.out.printf("%s : %d\n",dto.getFirstName(),dto.getSalary());
		}
	}

}
