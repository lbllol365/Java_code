import java.util.Scanner;

public class PracticeAdd_1{
	public static void main(String[] args){
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		//create 3 numbers

		Scanner input = new Scanner(System.in);

		System.out.print("What is " + number1 + "+" + number2 + "+" + number3 + "+" + "=" + "?");

		int answer = input.nextInt();
		//Get the answer

		if(answer == (number1 + number2 + number3))
			System.out.print("You are right!");
		else 
			System.out.print("You are wrong!!");
	}
}