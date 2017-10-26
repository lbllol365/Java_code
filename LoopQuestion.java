import java.util.Scanner;

public class LoopQuestion{
	public static void main(String[] args){
		final int theNumberOfQuestion = 5;
		int correctCount = 0;//Number of right answer
		int count = 0;//Number of question
		long startTime = System.currentTimeMillis();//get the start time
		String output = "";

		Scanner input = new Scanner(System.in);
		//create new Scanner

		while(count < theNumberOfQuestion){

			int number1 = (int)(Math.random() * 10);
			int number2 = (int)(Math.random() * 10);
			//create two numbers

			if(number2 > number1){
				//if number2 > number1 ,change them
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}

			System.out.print("What is" + number1 + "-" + number2 + "? ");
			int answer = input.nextInt();
			//Give the question and get the answer

			if(answer == (number1 - number2)){
				System.out.print("You are right!!");
				correctCount++;
			}
			else
				System.out.print("Your answer is worng!! The right answer is " + (number1 - number2));
			//Get the answer

			count++;

			output += "\n" + number1 + "-" + number2 + "=" + answer + 
			((number1 - number2 == answer) ? " correct" : " wrong");

		}

		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		//Compute the testTime

		System.out.print("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + "seconds\n" + output);
		//print the answer

	}
}