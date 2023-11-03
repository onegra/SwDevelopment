package day16;

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
		int total = kor + eng + math;
		double average = total/3.0;
		average = Double.valueOf(String.format("%.1f", average));
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math+ "," + total +","+average;
	} 

}

public class Ex6_2 {
	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76);
		
		String str = s.info();
		System.out.println(str);
		
	}

}