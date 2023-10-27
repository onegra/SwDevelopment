package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[3];
		int [] tmp;
		
		LOOP : while(true) {
			for (int i = 0; i<arr.length; i++) {
				if(arr[i]==0) {
					System.out.print("정수 입력 : ");
					arr[i] = sc.nextInt();
					if(arr[i] == 0) {
						break LOOP;
					}
				}
			}
			System.out.println(Arrays.toString(arr));
			tmp = new int[arr.length + 3];
			for (int i = 0; i<arr.length; i++) {
				tmp[i] = arr[i];
			}
			arr =tmp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("끝");
		sc.close();
	}

}
