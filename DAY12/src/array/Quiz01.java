package array;

import java.util.Arrays;

public class Quiz01 {
	public static void main(String[] args) {
		int[] arr = {9, 54, 23,72,99,85,31,16,49,62};
		//1)arr에서 홀수의 개수와 짝수의 개수를 각각 변수에 담아서 출력하세요
		int n1 = 0, n2 = 0;
		for (int i = 0; i<arr.length; i++) {
			if(arr[i] % 2 ==0){
				n2 ++;
				}
			else 
				n1 ++;
		}
		
		System.out.printf("홀수 : %d, 짝수 : %d",n1 ,n2);
		
		System.out.println();
		
		//2)arr에서 홀수만 골라서 합계를 구한 다음 출력하세요
		int oddsum = 0; 
				for(int i = 0; i<arr.length; i++) {
					if (arr[i] % 2 != 0) {
						oddsum += arr[i]; 
					}
				}
				System.out.println("홀수의 합계 : " + oddsum);
				
		//3)arr에서 짝수만 골라서 새로운 배열 arr2에 저장하고 출력하세요
		
		int [] arr2 = new int[n2];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr2[k] += arr[i];
				k++;
			}
		}
		System.out.println("짝수의 배열 :" + Arrays.toString(arr2));
		
		//4)arr에서 내용을 거꾸로 담은 배열 arr3를 만들어서 출력하세요
		int [] arr3 = new int [arr.length];
		for(int i = 0; i < arr.length; i++) {
			int a = arr.length -1 -i;
			arr3[a] = arr[i];
		}
		System.out.println(Arrays.toString(arr3));
		
		//5)arr를 내림차순 정렬한 후 다시 출력하세요
		for (int i = 0; i< arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) { //오름차순과 내림차순은 크기 비교에 의해서 결정된다
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
