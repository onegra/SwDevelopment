package day16;

class Student2{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public int getTotal() {
		int total;
		total = kor + eng + math;
		return total;
	}

	public double getAverage(){
		double averge;
		averge =  getTotal()/3.0;
		return averge; 
	}	

	}
public class Ex6_3 {
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.name = "홍길동"; 
		s.ban = 1; 
		s.no = 1; 
		s.kor = 100; 
		s.eng = 60; 
		s.math = 76;
		
		System.out.println("이름 :"+s.name); 
		System.out.println("총점 :"+s.getTotal());  
		System.out.printf("평균 :"+s.getAverage());
		
	}

}