package accessModifier;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Human ob = new Human();
		
		String name;
		int age;
		
		System.out.println("이름 : ");
		name = sc.nextLine();
		
		System.out.println("나이 : ");
		age = sc.nextInt();
		
		ob.setName(name);
		ob.setAge(age);
		System.out.printf("%s(%d살)",ob.getName(),ob.getAge());
		sc.close();
	}

}
