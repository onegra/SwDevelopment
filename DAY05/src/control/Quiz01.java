package control;

import java.util.Random;

public class Quiz01 {

	public static void main(String[] args) {
		//게시글 데이터의 총 개수가 주어지면 여러 게시글을 총 몇개의 페이지로 나누어서 불러와야 할 지 계산하여 출력하세요
		//-페이지 당 게시글 출력 개수는 10개이다
		//-하나의 게시글이라도 생략되면 안된다
		//-총 게시글 수는 10000~9999사이이다
		//-요청으로 읽어들여야 할 게시글의 번호가 제시된다
		//-출력으로 불러와야 할 게시글의 번호를 n번부터 n+10까지 가져와야한다
		/*
		Random ran = new Random();
		int boardcount = ran.nextInt(89999) + 10000;
		int pagecount = boardcount/10;
		int page = ran.nextInt(pagecount) + 1;
		int end = page * 10 ; 
		int begin = end-9 ; 
		if(end > boardcount) {
			end = boardcount;
		}
		System.out.println("총 게시글의 개수 : "+ boardcount);
		System.out.println("요청받은 페이지 : " + page);
		System.out.printf("%d개의 게시글에서 %d페이지를 요청받았으므로, \n",boardcount,page);
		System.out.printf("%d번부터 %d번 게시글을 불러와서 출력하면 된다\n",begin, end);
		*/
		Random ran = new Random();
		int boardcount = ran.nextInt(89999) + 10000;
		int pagecount = boardcount/10; //한 페이지 당 10개의 글을 넣으니까 나눈다
		if (boardcount % 10 != 0) {    //나누었을 때 나머지가 존재한다면
 			pagecount += 1;            //나머지 게시글도 보여주기 위한 페이지를 1 추가한다
		}
		int page = ran.nextInt(pagecount) + 1; //페이지 개수 범위 안에서 특정 페이지를 요청한다
		int begin = page * 10 - 9 ; 
		int end = page * 10 ; 
		
		
		System.out.println("총 게시글의 개수 : "+ boardcount);
		System.out.println("요청받은 페이지 : " + page);
		System.out.printf("%d개의 게시글에서 %d페이지를 요청받았으므로, \n",boardcount,page);
		System.out.printf("%d번부터 %d번 게시글을 불러와서 출력하면 된다\n",begin, end);
	}

}
