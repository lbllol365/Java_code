import java.util.Scanner;

public class ComputeZhiFuPrice_1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter your remain price!!\n");
		double remainPrice = input.nextDouble();
		//Get remain price 

		System.out.println("Please enter rate!!\n");
		double rate = input.nextDouble();
		//Get rate

		double zhifuPrice =remainPrice * (rate / 1200);
		//compute the answer

		System.out.println("The price you need to pay is " + zhifuPrice);
		//print the answer
	}
}