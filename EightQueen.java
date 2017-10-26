//本程序是生成八皇后问题的一个解（即没有两个皇后是在同一行，
//同一列或者是同一对角上）。

import java.util.Scanner;
import java.util.Random;

public class EightQueen{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//创建新的Scanner对象	
		char[] [] character_1 = {{'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
							{'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
							{'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
							{'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
							{'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
							{'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
							{'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'},
							{'|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|',' ','|'}
						};
		//初始化棋盘数组
		System.out.println("原始棋盘为：");
		for(int j = 0;j < 8;j++)
			for(int i = 0;i < 17;i++){
				System.out.print(character_1[j] [i]);
				if(i == 16)
					System.out.print("\n");
			}
		//输出原始棋盘
		System.out.print("\n");
		System.out.println("八皇后问题的一个解为：");
		int[] choice = new int[8];
		//初始化选择数组
		choice = randomNumber();//生成第一个位置数组
		int deal = Judge(choice);
		System.out.println(deal);
		while(deal != 1){
		choice = randomNumber();
		for(int jk = 0;jk<8;jk++)
			System.out.print(choice[jk]);
		System.out.print("\n");
		deal = Judge(choice);
		}//计算满足要求的每行棋子的位置
		for(int h = 0;h < 8;h++){
			character_1[h] [2 * choice[h] - 1] = 'Q';
		}//根据最后生成的位置数组填充棋子
		for(int j = 0;j < 8;j++)
			for(int i = 0;i < 17;i++){
				System.out.print(character_1[j] [i]);
				if(i == 17)
					System.out.print("\n");
			}//打印结果
	}

	public static int[] randomNumber(){
		Random random = new Random();
		//创建新的Random对象
		int[] choice_1 = new int[8];
		int min = 1;
		int max = 8;//指定每一行的棋子位置范围
		for(int o = 0;o < 8;o++)
			choice_1[o] = random.nextInt(max) % (max - min + 1) + min;
		return choice_1;
	}

	public static int Judge(int[] number){
		int deal_1 = 1;
		int length = number.length;
		for(int c = 0;c < length;c++){
			for(int b = (c + 1);b < length;b++)
				if((number[c] == number[b]) || (number[c] == (number[b] - 1)) || (number[c] == (number[b] + 1))){
					deal_1 = 0;
				}
			}
		return deal_1;
	}
}