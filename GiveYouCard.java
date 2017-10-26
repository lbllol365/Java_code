import java.util.Scanner;
import java.util.Random;

public class GiveYouCard{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//create Scanner

		Random random = new Random();

		int max = 13;
		int min = 1;

		int choice1 = random.nextInt(max) % (max-min+1) + min;
		//Get the first chocie

		String s1 = " ";

		if(choice1 == 1)
			s1 = "Ace";
		else if(choice1 == 11)
			s1 = "Jack";
		else if(choice1 == 12)
			s1 = "Queen";
		else if(choice1 == 13)
			s1 = "King";
		else 
			s1 = String.valueOf(choice1);
		//Deal some special choices

		int max2 = 4;
		int min2 = 1;

		int choice2 = random.nextInt(max2) % (max2 - min2 + 1) + min2;
		//Get the second choice

		String s2 = " ";

		if(choice2 == 1)
			s2 = "Clubs";
		else if(choice2 == 2)
			s2 = "Diamond";
		else if(choice2 == 3)
			s2 = "Heart";
		else if(choice2 == 4)
			s2 = "Spades";
		//Change the second choice to the string

		System.out.print("The card you picked is " + s1 + " of " + s2);
		//print the answer
	}
}