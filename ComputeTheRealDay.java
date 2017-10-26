import java.util.Scanner;

public class ComputeTheRealDay{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//create a scanner

		System.out.print("Please enter year(e.g:2008):  ");
		int year = input.nextInt();
		//Get the year

		System.out.print("Enter month(1-12):   ");
		int month = input.nextInt();
		//Get the month

		System.out.print("Enter the day of the month(1-31):   ");
		int day = input.nextInt();
		//Get the day of the month

		if(month == 1){
			month = 13;
			year -= 1;
		}
		else if(month == 2){
			month = 14;
			year -= 1;
		}
		//Deal the special month

		int data1 = (int)(26 * (month + 1) / 10);
		int data2 = year % 100;
		int data3 = year / 100;
		//Compute the between data

		int theRealDay = (day + data1 + data2 + (int)(data2 / 4) + (int)(data3 / 4) + 5 * data3) % 7;
		//Compute the answer

		if(theRealDay == 0){
			System.out.print("Day of the week is 6th day");
		}
		else if(theRealDay == 1){
			System.out.print("Day of the week is 7th day");
		}
		else if(theRealDay == 2)
			System.out.print("Day of the week is 1st day");
		else if(theRealDay == 3)
			System.out.print("Day of the week is 2nd day");
		else if(theRealDay == 4)
			System.out.print("Day of the week is 3rd day");
		else if(theRealDay == 5)
			System.out.print("Day of the week is 4nd day");
		else if(theRealDay == 6)
			System.out.print("Day of the week is 5nd day");
		else
			System.out.print("It's wrong!!!");
		//print the answer
	}
}