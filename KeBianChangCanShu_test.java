//这是一个用于测试可变长度参数列表的程序

import java.util.Scanner;

public class KeBianChangCanShu_test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//创建新的Scanner对象

		double[] test_1 = new double[5];
		//创建测试用的双浮点精度的数组

		System.out.println("Please enter 5 numbers!!");

		for(int i = 0;i < test_1.length;i++){
			test_1[i] = input.nextInt();
		}
		printMax(test_1);
		//调用可变长参数列表的函数
}
		public static void printMax(double... numbers){
			if(numbers.length == 0){
				System.out.println("你所给的数据有错误，请重新输入!!");
				return;
			}//判断所给可变长的数据是否为空，如果为空直接返回
			double the_max = numbers[0];
			//初始化最大值
			for(int k = 1;k < numbers.length;k++){
				if(numbers[k] > the_max){
					the_max = numbers[k];
				}
			}
			System.out.println("你所给数据中的最大值为 " + the_max);
		}
	}
