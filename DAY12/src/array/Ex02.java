package array;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int [] arr1 = null; //배열을 가리킬 변수만 생성했음 실제 배열은 없음
		//대상을 가리키는 형식의 참조변수이지만 지금 당장은 가리킬 대상이 없다
		
		int [] arr2 = {1,2,3,4,5}; //{}안에 값을 지정하여 생성
		
		//배열을 구성할 값을 지정하여 배열을 생성
		int [] arr3 = new int[] {6,7,8,9,10};
		
		//배열의 값은 지정하지 않으나, 배열의 길이를 지정하여 배열을 생성
		//이때 배열의 각 값은 자료형에 대응되는 0값으로 자동 초기화가 이루어진다
		//따라서 아래 배열의 값은{0,0,0,0,0}이다
		int [] arr4 = new int[5];
		
		//배열을 생성할 때는 길이 혹은 값중에서 하나의 방법으로만 지정한다
		//둘 다 지정하는 것은 문법에 맞지않는다
		//int [] arr5 = new int[5] {1,2,3,4,5}; <-문법츨림
		
		//null여면 가리키는 대상이 없다는 뜻이다
		System.out.println("arr1 : "+arr1);
		
		//자바의 배열은 그대로 출력하면 내부 값을 확인할 수 있다
		System.out.println("arr2 : "+arr2);
		
		//값을 확인하려면 반복문을 이용하여 출력할 수 있다
		System.out.println("arr2 : "+arr2);
		for (int i =0;i < arr3.length; i++) {
			System.out.println(arr3[i] +"" );
		}
		System.out.println();
		
		System.out.println("arr4 : " + Arrays.toString(arr4));
		arr4[0] = 11;
		arr4[1] = 33;
		arr4[2] = 55;
		arr4[3] = 77;
		arr4[4] = 99;
		
		System.out.println("arr4 : " + Arrays.toString(arr4));
	}

}
