import java.util.Scanner;
import java.util.Random;

public class Test_11{
	public static void main(String[] args){
		Random random = new Random();

		int choice_temp;
		int min = 0;
		int max = 2;
		for(int i = 0;i < 100;i++){
			choice_temp = random.nextInt(max) % (max - min + 1) + min;
			System.out.print(choice_temp);
		}
	}
}