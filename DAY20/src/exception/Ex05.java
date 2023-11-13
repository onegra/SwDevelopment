package exception;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.naver.com/");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		Scanner sc = new Scanner(conn.getInputStream());
		
		String str = "";
		while(sc.hasNextLine()) {
			str += sc.nextLine();
		}
		str = str.replace(">", ">\n");
		sc.close();
		conn.disconnect();
		System.out.println(str);
		System.out.println(str.length());
	}

}
