 import java.util.Scanner;

 public class HuiWenQuestion{
 	public static void main(String[] args){
 		Scanner input = new Scanner(System.in);
 		//create new scanner

 		System.out.print("Please enter your data!!");
 		int data = input.nextInt();
 		//Get data

 		if(isPalindrome(data))
 			System.out.print("shi hui wen shu !");
 		else 
 			System.out.print("bu shi hui wen shu!!");
 	}
 	//print the answer

 	public static int reverse(int number){
 		int weishu = 0;
 		int temp = number;//bao hui yuan shu ju
 		for(int deal = 1;deal != 0;weishu++){
 			temp = temp / 10;
 			deal = temp;
 		}
 		//ji suan wei shu
 		int newNumber = 0;
 			for(;weishu > 0;weishu--){
 				int weiShangShu = number % 10;
 				int chengShu = 1;
	 			for(int cishu = 0;cishu < (weishu - 1);cishu++){
	 				chengShu *= 10; 
	 			}
	 			newNumber = newNumber + weiShangShu * chengShu;
	 			number /= 10;
	 		}
	 	System.out.print(newNumber);
	 	return newNumber;		
 		}

 	public static boolean isPalindrome(int number){
 		return (number == reverse(number));
 		//diao yong REVERSE han shu ,pan duan shi fo wei hui wen shu,bing fan hui bu er zhi 
 }
}