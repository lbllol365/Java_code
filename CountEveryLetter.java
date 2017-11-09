import java.util.Scanner;

public class CountEveryLetter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("请输入想要统计的字符串");
		String s = input.nextLine();

		int[] counts = countLetter(s.toLowerCase());

		for(int i = 0;i < counts.length;i++){
			if(counts[i] != 0 ){
				System.out.println((char)('a' + i) + "出现了" + counts[i] + '次');
			}
		}
	}

	public static int[] countLetter(String st){
		int[] counts_temp = new int[26];

		for(int i = 0;i < st.length();i++){
			if(Character.isLetter(st.charAt(i))){
				counts_temp[st.charAt(i) - 'a']++;
			}
		}

		return counts_temp;
	}
}