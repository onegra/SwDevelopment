package loop;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("hello");
		//hello를 5줄 출력하기
		int i = 0;
		while(i < 5) {
			System.out.println("hello");
			i++;
		}
		System.out.println();
		
		//값이 변하는 숫자 출력하기
		i = 0;
		while(i<5) {
			System.out.print(i + " ");
			i+=1;
		}
	System.out.println();
	
	char ch = 'A'; // 반복문은 일정한 조건(일정한 규칙)에 의해 반복된다
	while(ch<='Z') {
		System.out.print(ch + " ");
		ch++;
	}
	System.out.println();
	
	//놀이기구 문제의 요금표를 반복문으로 간단하게 표현
	int st =31;
	int fee = 500;
	System.out.println("0~30분 : 3000원");
	
	while(fee <= 10000) {
		System.out.printf("%d ~%d분 : %d원",st, st+9, fee);
		st += 10;
		fee += 500;	
	}
	System.out.println();
	//오전취업반의 수업시간은 9시, 10시, 11시, 12시반 1시반 2시반이다
	//while를 이용하여 출력
	int n1 =9, n2=0, n3= 9, n4 = 50;
	
	while(n1<15) {
		System.out.printf("%02d:%02d ~ %02d:%02d\n",n1,n2,n3,n4);
		n1 += 1;
		n3 = n1;
		
		if(n1 >= 12) {
			n3 += 1;
			n2 = 30;
			n4 = 20;
		}
		
	}
	}

}
