/*

随手实验

import java.util.Scanner;

public class Test_2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

		String s = input.nextLine();

		System.out.println(a);

		System.out.println(s);

		System.out.println("Hello");
	}
}

*/

import  java.util.Scanner;

public class Circle_4{
	public double getArea(){
		return r * r * Math.PI;
	}

	private double r = 1;

	public Circle_4(double new_r){
		r = new_r;
	}
}

public class Test_circle_4{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a r");

		double ra = input.nextDouble();

		Circle_4 c = new Circle_4(ra);

		System.out.println(c.getArea());


	}
}