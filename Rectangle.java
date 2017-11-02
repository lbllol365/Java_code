public class Rectangle{
	double width = 1;
	double heigth = 1;

	public Rectangle(){

	}
	public Rectangle(double temp_width,double temp_heigth){
		width = temp_heigth;
		heigth = temp_heigth;
	}

	public double getArea(){
		return width * heigth;
	}

	public double getPerimeter(){
		return width * 2 + heigth * 2;
	}

}