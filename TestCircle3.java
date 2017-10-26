public class TestCircle3{
	public static void main(String args[]){
		Circle3 c1 = new Circle3(12.8);

		System.out.println(c1.getArea());
		System.out.println(c1.getRadius());
		c1.setRadius(11.1);
		System.out.println(c1.getRadius());
		System.out.println(c1.getNumberOfCircle());

		Circle3 c2 = new Circle3(12.1);

		System.out.println(c2.getArea());
		System.out.println(c2.getNumberOfCircle());

		printCircle(c2);
	}

	public static void printCircle(Circle3 c){
		System.out.println(c.getArea() + c.getRadius());
	}
}