import java.util.Scanner;

/*判断输入的数是否1-9都存在*/

public class NumberExist{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//创建新的scanner对象

		boolean[] exist = new boolean[9];
		//创建核心判断数组

		System.out.print("Please enter your first data!!");
		int data = input.nextInt();
		while(data != 0){
			System.out.print("Please enter your data!!");
			exist[data - 1] = true;
			data = input.nextInt();
		}
		//如果某数字存在，修改对应数组位置的值为真
		
		boolean all_exist = true;
		//全部数字存在判断变量

		for(boolean u : exist){
			if(!u){
				all_exist = false;
				break;
			}
		}
		//遍历数组，如果某个数字不存在，改变all_exist变量的值
		if(all_exist)
			System.out.print("全部存在！");
		else 
			System.out.print("有数字不存在！");
		//打印最终结果
	}
}