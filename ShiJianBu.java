import java.util.Scanner;
import java.util.Random;

public class ShiJianBu{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//create new scanner
		Random random = new Random();
		int max = 3;
		int min = 1;
		int human_choice_number = 0;
		/*shi tou: 3
		  jiandao: 2
		  bu     : 1
		  yu dao 1 3 or 3 1 swap them
		*/

		for(int human_win_count = 0;human_win_count<2;){
			int choice_cpu = random.nextInt(max) % (max - min + 1) + min;
			//Get computer's choice
			System.out.print("Enter your choice!");
			String choice_hunam = input.nextLine();
			//Get human player's choice
			if(choice_hunam.equals("shitou"))
				human_choice_number = 3;
			if(choice_hunam.equals("jiandao"))
				human_choice_number = 2;
			if(choice_hunam.equals("bu"))
				human_choice_number = 1;
			//make string choice to number
			if((human_choice_number == 1 && choice_cpu == 3) || (human_choice_number == 3 && choice_cpu == 1)){
				int temp = human_choice_number;
				human_choice_number = choice_cpu;
				choice_cpu = temp;
			}
			//if 1 and 3 or 3 and 1  swap them
			if(human_choice_number > choice_cpu){
				System.out.print("human win!!");
				human_win_count++;
			}
			else
				System.out.print("CPU win!!");
		}
	}
}