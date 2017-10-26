import java.util.Scanner;

public class DisplayTime{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer for seconds:");
		int seconds = input.nextInt();
		int mins = seconds / 60;
		int ses =  seconds % 60;
		System.out.print("seconds is" + mins + " minutes " + ses + " seconds");
	}
}