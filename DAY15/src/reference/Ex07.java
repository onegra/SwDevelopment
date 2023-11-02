package reference;

import java.util.Arrays;


public class Ex07 {
	
	static void sortIntArray(Integer[] arr) {
		for (int i = 0; i< arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) { //오름차순과 내림차순은 크기 비교에 의해서 결정된다
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	static void sortStringArray(String[] arr2) {
		for (int i = 0; i< arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if(arr2[i].compareTo(arr2[j]) > 0) {
					String tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		boolean flag1 = n1 - n2 > 0;
		
		String s1 = "Hello", s2 = "World";
		boolean flag2 = s1.compareTo(s2) > 0;
		
		System.out.println("n1이 n2보다 크다 : " + flag1);
		System.out.println("s1이 s2보다 크다 : " + flag2);
		
		System.out.println("n1이 n2보다 작다 : " + !flag1);
		System.out.println("s1이 s2보다 작다 : " + !flag2);
		
		Integer[] arr = {50,40,30,20,10};
		String[] arr2 = {"원빈","현빈","우빈","준빈","다빈"};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		sortIntArray(arr);
		sortStringArray(arr2);
		//정수배열을 오름차순으로 정렬하는 함수 sortIntArray(int[] arr)
		//문자열배열을 오름차순으로 정렬하는 함수 sortStringArray(String[] arr)
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println();
		
		Arrays.sort(arr, (num1,num2)->num1-num2); //int는 클래스가 아니라서 Integer로 변경
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr2,(a,b)-> a.compareTo(b));
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
