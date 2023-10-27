package array;

public class Ex05 {
	public static void main(String[] args) {
		int n1=10,n2=20;
		System.out.printf("n1 : %d, n2 : %d\n", n1,n2);
		//두 변수의 값을 교환하여 다시 출력하기
		int tmp = n1;
		n1 = n2;
		n2 = tmp;
		
		System.out.printf("n1 : %d, n2 : %d\n",n1,n2);
	}

}
