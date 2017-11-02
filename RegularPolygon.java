//多边形类
//《Java语言程序设计》习题8.9

public class RegularPolygon{
	private int n = 3;
	//定义多边形的边数

	private double side = 1;
	//每条边的长度

	private double x = 0;
	//定义多边形中点x坐标

	private double y = 0;
	//定义多边形中点y坐标

	public RegularPolygon(){

	}

	public RegularPolygon(int temp_n,double temp_side){
		n = temp_n;
		side = temp_side;
	}

	public RegularPolygon(int temp_n,double temp_side,double temp_x,double temp_y){
		n = temp_n;
		side = temp_side;
		x = temp_x;
		y = temp_y;
	}

	public int getN(){
		return n;
	}

	public double getSide(){
		return side;
	}

	public double[] getMediumPoint(){
		double[] point = new double[2];
		point[0] = x;
		point[1] = y;

		return point;
	}

	public double getPerimeter(){
		return n * side;
	}

	public double getArea(){
		return n * n * side;
	}
}