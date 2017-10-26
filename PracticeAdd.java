import java.util.Scanner;

public class PracticeAdd{
	public static void main(String[] args){
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		Scanner input = new Scanner(System.in);

		System.out.print("What is " + number1 + "+" + number2 + "=" + "?");

		int answer = input.nextInt();

		if(answer == (number1 + number2))
			System.out.print("You are right!!");
		else
			System.out.print("You are wrong!!");
	}
}