//本程序是判断用户输入的4*4矩阵是否符合数独规则
//输入：4 * 4 矩阵
//输出：是否符合规则

import java.util.Scanner;

public class CheckSuDo{
	public static void main(String[] args){
		int[] [] sudo = getArray();
		//调用输入函数获得需要判断的矩阵

		System.out.println(isValid(sudo) ? "Valid solution" : "Invalid solution");
		//调用判断函数，并根据返回的布尔值选择输出的语句（结果）
	}

	public static int[] [] getArray(){
		Scanner input = new Scanner(System.in);
		//创建新的Scanner对象

		int[] [] sudo_temp = new int[4] [4];
		//创建数独数字储存数组

		System.out.println("请输入一个4 * 4 的矩阵：");

		for(int i = 0;i < 4;i++){
			for(int j = 0;j < 4;j++){
				sudo_temp[i] [j] = input.nextInt();
			}
		}//获取用户输入的数组

		return sudo_temp;
	}

	public static boolean isValid(int[] [] temp){
		for(int i = 0;i < 4;i++){
			for

		}
	}

	public static boolean isValidEvery(int[] tp){
		boolean deal = true;
		for(int i = 0;i < (tp.length);i++){
			for(int j = (i + 1);j < (tp.length);j++){
				if(tp[i] == tp[j]){
					deal = false;
					break;
				}
			}
			if(!deal)
				break;
		}

		return deal;
	}
	//本函数是判断每一行是否有重复的数字，并返回布尔值

	public static int[] [] changeArray(int[] [] tp_2){
		int[] [] overArray = new int[4] [4];
		//创建转置后的矩阵

		for(int i = 0;i < 4;i++){
			for(int j = 0;j < 4;j++)
				overArray[j] [i] = tp_2[i] [j];
		}
		//转置矩阵

		return overArray;
	}//本函数是转置一个4 * 4的矩阵，并返回转置后的矩阵
}