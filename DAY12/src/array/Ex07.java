package array;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		String str = "qwertyuiopasdfghjklzxcvbnm";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i ++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
				char tmp;
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		}
//		System.out.println(char[] arr);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
	}

}
