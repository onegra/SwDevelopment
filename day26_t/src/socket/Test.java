package socket;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd E요일");
		Date st = sdf.parse("2023-10-17");
		Date now = new Date();
		
		long ln1 = now.getTime() - st.getTime();
		System.out.println(ln1 / 1000 / 60 / 60 / 24);
		int i = 1;
		for(long ln = st.getTime(); ln <= now.getTime(); ln += 1000 * 60 * 60 * 24) {
			Date d = new Date(ln);
			String s = sdf2.format(d);
			if(!s.contains("토요일") && !s.contains("일요일")) {
				System.out.println(s + " | " + i++);
			}
		}
	}
}
