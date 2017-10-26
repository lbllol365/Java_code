import java.util.Scanner;

public class ChangeType{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the data you want to change as double !!");
		double celsius = input.nextDouble();

		double fahrenheit = (9.0/5) * celsius + 32.0;

		System.out.println("The data you want is " + fahrenheit);
	}
}