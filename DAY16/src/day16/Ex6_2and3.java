package day16;

class Student3{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student3(String name, int ban, int no, int kor, int eng, int math) {
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
	
	void show() {
		
	}

}

public class Ex6_2and3 {
	public static void main(String[] args) {
		Student3 s = new Student3("홍길동",1,1,100,60,76);
		
		String str = s.info();
		System.out.println(str);
		
	}

}