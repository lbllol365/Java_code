import java.util.Scanner;
import java.util.Random;
/*
这是一个十分无聊的掷骰子的程序，每个骰子六个面（1，2，3，4，5，6），
如果第一次两个骰子的数加和等于2、3或者12，你就输了
如果加和等于7或者11，你就赢了，如果不属于以上两种情况，
再掷骰子直到，加和是7，你就输了，加和是第一次掷骰子的加和你就赢了
*/
public class ZhiShaiZi{
	public static void main(String[] args){
		int choice_1,choice_2;
		int min = 1;
		int max = 6;
		int another_data;
		//声明变量
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		//创建新的Random对象和Scanner对象

		choice_1 = random.nextInt(max) % (max-min+1) + min;
		choice_2 = random.nextInt(max) % (max-min+1) + min;
		//得到第一次掷骰子的两个结果

		System.out.println("You rolled" + choice_1 + "+" + choice_2 + "=" + (choice_1 + choice_2) + "\n");
		//打印第一次的结果
		if((choice_1 + choice_2) == 3 || (choice_1 + choice_2) == 12 || (choice_1 + choice_2) == 2){
			System.out.println("You are a loser!!! \n");
			System.exit(0);
		}
		//如果加和是3或者12，则打印“你输了”，并停止程序
		else if((choice_1 + choice_2) == 7 || (choice_1 + choice_2) == 11){
			System.out.println("You are a winner!!!\n");
			System.exit(0);
		}
		//如果加和是7或者11，则打印“你赢了”，并停止程序
		else{
			another_data = choice_1 + choice_2;//如果加和是其他数字，保存加和，进行下一步处理
			System.out.println("You first rolled numbers' sum is" + (choice_1 + choice_2) + "\n");
			choice_1 = 0;choice_2 = 0;//重置掷骰子的结果
			while(true){
				choice_1 = random.nextInt(max) % (max-min+1) + min;
				choice_2 = random.nextInt(max) % (max-min+1) + min;
				if((choice_1 + choice_2) == 7){
					System.out.println("The number you rolled are" + choice_1 + "and" + choice_2 + "\n");
					System.out.println("You are a loser!!\n");
					break;
				}//如果第二次结果加和是7，打印两个骰子的值和“你输了”，并停止循环
				else if((choice_1 + choice_2) == another_data){
					System.out.println("The number you rolled are" + choice_1 + "and" + choice_2 + "\n");
					System.out.println("You are a winner!!\n");
					break;
				}//如果第二次结果加和等于第一次的加和，打印两个骰子的值和“你赢了”，并停止循环
			}
		}
	}
}