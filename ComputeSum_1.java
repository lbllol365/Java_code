import java.util.Scanner;

public class ComputeSum_1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//create a new Scanner

		System.out.print("Please enter your data!!");
		int data = input.nextInt();
		//get data

		int sum = 0;

		sum = sumDigits(data);
		//diao yong han shu

		System.out.print("Sum is " + sum);
		//print the answer

	}

	public static int sumDigits(int n){
		int sum = 0;
		for(int i = 1;i != 0;){
			int weishu = n % 10;
			n = n / 10;
			sum += weishu; 
			i = n;
		}
		//compute the sum
		return sum;
	}
}