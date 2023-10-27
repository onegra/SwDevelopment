package array;

import java.util.Arrays;
import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		//랜덤정수 10개를 배열에 저장하여 그중 가장 큰 수와 가장 작은 수를 구하여 출력하기
		Random ran = new Random();
		int[] arr = new int[10];
		
		for (int i = 0; i< arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		int min = Integer.MAX_VALUE;  //최솟값
		int max = Integer.MIN_VALUE;  //최댓값
		
		for (int i = 0; i< arr.length;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
	System.out.println("베열에서의 최소값 : "+min);
	System.out.println("베열에서의 최대값 : "+max);
	}
	

}
