import java.util.Scanner;

public class DisplayPrice{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your price");

		double price = input.nextDouble();

		double tax = price * 0.06;
		double real_tax = (int)(tax * 100) / 100.0;

		System.out.print("your real price is" + real_tax);
	}
}