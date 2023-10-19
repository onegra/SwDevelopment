package loop;

public class Quiz01 {

	public static void main(String[] args) {
		// 1) 자신의 이름을 5회 반복하여 출력하세요
		String name = "강원지";
		int num = 0;
		int i = 0;
		while(i<5) {
			System.out.print(name + " ");
			i++;
		}
		System.out.println();
		
		// 2) 0부터 5까지 한줄에 출력하세요
		i = 0;
		while(i <6) {
			System.out.print(i + " ");
			i += 1;
		}
		System.out.println();
		
		// 3) 5부터 0까지 한줄에 출력하세요
		i = 5;
		while(i > 0) {
			System.out.print(i + " ");
			i -= 1;
		}
		System.out.println();
		
		//4) 1부터 100까지 합계를 구하여 출력하세요
		i = 0;
		while(i < 100) {
			i++;
			num += i;
			if(i == 100)
			System.out.println(num);
		}
		
		//5) 1부터 100사이의 정수 중, 7의 배수만 한줄에 출력하세요
		i = 0;
		while(i < 101) {
			i ++;
			if(i % 7 == 0) {
			System.out.print(i + " ");
		}
		}
	}

}
