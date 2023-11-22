package socket;

import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) throws Exception{
		File f = new File ("index.html"); //접속할 클라이언트에게 보낼 파일을 하나 준비한다
		Scanner sc = new Scanner(f); //파일의 내용을 읽어내는 스캐너
		
		ServerSocket ss = new ServerSocket(1234); //접속자와 소켓을 생성하기 위한 서버소켓
		
		System.out.println("접속 대기중...");
		Socket so = ss.accept(); //클라이언트가 접속하면 이후 코드 실행
		System.out.println("접속 : " +so.getInetAddress());
		
		OutputStreamWriter osw = new OutputStreamWriter(so.getOutputStream(),"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			bw.write(data+"\r\n");
		}
		bw.flush();
		bw.close();
		sc.close();
		so.close();
		ss.close();
	}

}
