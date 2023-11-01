package accessModifier;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Human[] arr = new Human[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			if(i % 2== 0 ) {
			arr[i] = new Human();
			System.out.println("이름 입력 : ");
			String name = sc.next(); //nextLine 를 쓰면 nextInt를 -> integer.parseint(sc.nextLine)로 바꿔써준다
			System.out.println("나이 입력 : ");
			int age = sc.nextInt();
			arr[i].setName(name);
			arr[i].setAge(age);
			}
		}
		System.out.println("=== 입력 완료 ===");
		System.out.println("=== 출력 시작 ===");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
			System.out.printf("%s : %d살\n",arr[i].getName(),arr[i].getAge());
			}
			}
		System.out.println("=== 출력 완료 ===");
		sc.close();
	}

}
