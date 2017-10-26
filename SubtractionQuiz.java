import javax.swing.JOptionPane;
import java.util.Scanner;

public class SubtractionQuiz{
	public static void main(String[] args){
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int temp;
		//create 2 numbers

		if(number1 < number2){
			temp = number1;
			number1 = number2;
			number2 = temp;
		}
		//if number1 < number2 change them
		
		System.out.println("What is " + number1 + "-" + number2 + "=" + "?");

		String answer_string = JOptionPane.showInputDialog(null,"Please enter your answer","Enter Data!!",JOptionPane.INFORMATION_MESSAGE);
		//input the answer as string

		int answer = Integer.parseInt(answer_string);
		//make data from string to int

		System.out.println(number1 + "-" + number2 + "=" + answer + "is" + (number1 - number2 == answer));
		//output the answer
	}
}