import java.util.Scanner;

public class JuageHuiWenZiChuan{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//创建新的Scanner对象

		System.out.println("请输入一个需要判断的字符串：");
		String s = input.nextLine();
		//捕捉用户输入的字串

		if(isHuiWenZiChuan(s)){
			System.out.println("这是一个回文字串");
		}
		else
			System.out.println("这不是一个回文字串");
	}

	public static boolean isHuiWenZiChuan(String string){
		int x = 0;
		int y = string.length() - 1;
		//x为字串的起始位置，y为字串的末位置

		while(x < y){
			if(string.charAt(x) != string.charAt(y))
				return false;
			x++;
			y--;
		}
		return true;
	}
}

