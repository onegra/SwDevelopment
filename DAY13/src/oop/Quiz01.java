package oop;

class Circle {
	double radius;
	double area;
	double pi = 3.14;
	
	Circle(double radius){
		this.radius = radius;
		this.area = radius*radius* pi;
	}
	
	void show() {
		System.out.println("반지름 : " + radius);
		System.out.printf("넓이 : %.2f\n",area);
	}

}

public class Quiz01 {
	public static void main(String[] args) {
		Circle ob1 = new Circle(2);
		Circle ob2 = new Circle(3.2);
		ob1.show();
		ob2.show();
	}

}
