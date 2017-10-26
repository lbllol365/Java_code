//本程序实现模拟豆机
//由用户输入球的个数和机器的槽数
//输出每个球的路径并模拟它们的下落结果
/*
此程序存在一些bug，
包括无法模拟将球堆砌起来的图像；
还有在传入合法参数后，会报数组越界。
*/

import java.util.Scanner;
import java.util.Random;

public class DropBalls{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//创建新的Scanner对象

		System.out.println("请输入球的个数：");
		int number_ball = input.nextInt();
		//获取球的个数

		System.out.println("请输入机器的槽数：");
		int number_cpu = input.nextInt();
		//获取机器的槽数

		char[] [] ball_fall = new char[number_ball] [number_ball + 1];
		for(int i = 0;i < number_ball;i++)
			for(int j = 0;j < (number_ball + 1);j++)
				ball_fall[i] [j] = ' ';
		//初始化豆机

		char[] [] route = new char[number_ball] [number_cpu];
		//初始化路径数组
	/*
		int[] number_total = new int[number_ball + 1];
		for(int i = 0;i < (number_ball + 1);i++)
			number_total[i] = 0;
		//创建并初始化每个槽中数目数组
	*/	
		int number = 0;
		//声明球所处位置变量（所撞到的柱子）
		for(int k = (number_ball-1);k >= 0;k--){
			int  deal = 1;
			for(int i = 0;i < (number_cpu - 1);i++){
				int min = 0;
				int max = 2;
				int choice_real = choice(min,max);
				if(choice_real == 1){
					++deal;
					route[number] [i] = 'R';
				}
				else{
					deal = deal;
					route[number] [i] = 'L';
				}
			}//模拟下落槽数-1次

		int choice_final = choice(0,2);
		deal = deal + choice_final;
		if(choice_final == 1)
			route[number] [number_cpu - 1] = 'R';
		else
			route[number] [number_cpu - 1] = 'L';
		//获取球最终落到的槽的编号
	
		//ball_fall[k - number_total[deal] + 1] [deal] = '0';
		//number_total[deal] = number_total[deal] + 1;	
		ball_fall[k] [deal] = '0';	
		number++;

		}
		//模拟用户输入数量的球的下落

		for(int i = 0;i < number_ball;i++){
			for(int j = 0;j < number_cpu;j++){
				System.out.print(route[i] [j]);
			}
			System.out.print("\n");
		}
		//输出每个球的路径

		for(int i = 0;i < number_ball;i++){
			for(int j = 0;j < (number_ball + 1);j++){
				System.out.print(ball_fall[i] [j]);
			}
			System.out.print("\n");
		}
		//输出模拟的下落图像
	}

	public static int choice(int min,int max){
		Random random = new Random();
		//创建新的Random对象
		int choice_temp;
		choice_temp = random.nextInt(max) % (max - min + 1) + min;
		//System.out.print(choice_temp);

		return choice_temp;
	}
	//本函数是模拟随机选择下落位置，0为左，1为右
}