package array;

public class Ex03 {
	public static void main(String[] args) {
		int[] arr= null;
		//System.out.println("배열의 길이: "+arr.length);
		int [] arr2= new int[] {1,2,3,4,5};
		arr = new int[] {1,2,3,4,5};
		
		System.out.println("arr[0] : " +arr[0]);
		System.out.println("arr[1] : " +arr[1]);
		System.out.println("arr[2] : " +arr[2]);
		System.out.println("arr[3] : " +arr[3]);
		System.out.println("arr[4] : " +arr[4]);
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
		System.out.println();
		
		for (int i = 0; i<5; i++) {
			arr[i] = (i + 1) * 10;
		}
		for (int i = 0; i<5; i++) {
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
		System.out.println();
		//1) arr 의 값에 5씩 더한 이후 출력하세요
		for (int i = 0; i<5; i++) {
			arr[i] +=5;
			System.out.printf("arr[%d] : %d\n",i,arr[i]);
		}
		System.out.println();
		//2) arr의 각 요소(element, member)중에서 3의 배수만 골라서 모두 합친 값을 출력
		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			if(arr[i] % 3 ==0)
				sum += arr[i];
		}
		System.out.println("sum : " + sum);
		System.out.println();
	}
}
