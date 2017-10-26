public class Circle3{
	private double radius = 1;

	private static int numberOfCircle = 0;

	public Circle3(){
		numberOfCircle++;
	}

	public Circle3(double temp_r){
		radius = temp_r;
		numberOfCircle++;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double guest_radius){
		radius = guest_radius;
	}

	public int getNumberOfCircle(){
		return numberOfCircle;
	}

	public double getArea(){
		return radius * radius * Math.PI;
	}
}