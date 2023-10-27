package array;
//선택 정렬 안보고쓰기
import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		int [] arr = {4,8,2,7,6};
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i< arr.length; i++) {
			for (int j = i + 1; j< arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
