package schedule;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.List;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Handler handler = new Handler();
		List<ScheduleDTO> list = null;
		SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat outputFormatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date date = null;
		int menu = -1;
		Date now = handler.getSysdate();
		String event;
		
		while(menu != 0) {
			System.out.println("=== DB 기준 현재 시간 ===");
			System.out.println(now);
			System.out.println("=====================");
			System.out.println("1. 전체 출력");
			System.out.println("2. 월별 검색");
			System.out.println("3. 일정 등록");
			System.out.println("4. 일정 삭제");
			System.out.println("0. 종료");
			System.out.println("선택 >>> ");
			menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 123:
				String version = handler.getVersion();
				System.out.println(version);
				break;
				
			case 1: 
				list = handler.selectAll();
				for(ScheduleDTO ob : list) {
					System.out.printf("%s : %s ~ %s\n",ob.getTitle(), ob.getStart_date(), ob.getEnd_date());
				}
				break;
			case 2:
				
				break;
			
			case 3:
				
				break;
			
			case 4: break;
			
			case 0:
				System.out.println("프로그램을 종료합니다");
				break;
			}
		} //end if while
	}

}
