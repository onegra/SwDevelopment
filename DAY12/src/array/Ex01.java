package array;

public class Ex01 {
	public static void main(String[] args) {
		String str = "hello";
		
		//다음 3개의 데이터를 각 2배씩 곱한다음 화면에 출력하세요
		int n1 =3, n2 =2,n3 = 5;
		//for(int i =1; i<3; i++) {
		//	ni = ni *2;
		//	System.out.println(ni);
		//} <-불가능한 코드
		//같은 자료형의 여러 변수를 연속된 메모리 공간에 배치하기 위해 사용하는 문법
		//여러 데이터를 연속된 메모리 공간에 배치하고,순번으로 구분하는 자료구조
		//이때 index는 항상 0부터 시작한다
		//배열에 들어간 변수의 개수에 따라서 배열의 길이(length)가 정해진다
		int[]arr = {n1,n2,n3,21,35};
		
		for (int i = 0; i<arr.length;i++) {
			int tmp = arr[i] *2;
			arr[i] = tmp;
			System.out.println(arr[i]);
		}
	}

}
