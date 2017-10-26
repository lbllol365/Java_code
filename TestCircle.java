public class TestCircle{
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		System.out.println(circle1.getArea());
		System.out.println(circle1.getRadius());

		Circle circle2 = new Circle(3.2);
		System.out.println(circle2.getRadius());
		System.out.println(circle2.getArea());
	}
}

class Circle{
	double radius;

	Circle(){
		radius = 1;
	}
	Circle(double temp_circle){
		radius = temp_circle;
	}

	double getRadius(){
		return radius;
	}

	double getArea(){
		return radius * radius * Math.PI;
	}
}