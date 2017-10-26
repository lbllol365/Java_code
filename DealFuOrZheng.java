import java.util.Scanner;

public class DealFuOrZheng{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//create new Scanner

		int sum = 0;
		int zheng_count = 0;
		int fu_count = 0;
		double average = 0.0;
		int all_count=0;
		int data;
		//sheng ming bian liang
		System.out.print("Please enter your data!!");
		data = input.nextInt();
		//shu ru di yi ge shu zi

		while(data != 0){
			sum += data;
			if(data > 0)
				zheng_count++;
			if(data < 0)
				fu_count++;
			all_count++;
			System.out.print("Please enter your next data!!");
			data = input.nextInt();
			if(data == 0)
				break;

		}
		average = sum /(double)all_count;
		//compute the average
		System.out.print(all_count + "numbers' sum is" + sum + "\nnumbers' average is" + average + "\n");
		System.out.print("zheng shu is" + zheng_count + "\nfu shu is" + fu_count);
		//print the answer
	}
}