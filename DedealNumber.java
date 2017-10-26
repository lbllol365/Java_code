import javax.swing.JOptionPane;

public class DedealNumber{
	public static void main(String[] args){
		String numberString = JOptionPane.showInputDialog(null,"Please enter the number you want to deal as integer: ","Enter your data!!",JOptionPane.QUESTION_MESSAGE);
		//Enter string data.

		int number = Integer.parseInt(numberString);
		//change data from string to integer.

		int gewei = number % 10;
		int geweiRemain = number / 10;

		int shiwei = geweiRemain % 10;
		int shiweiRemain = geweiRemain / 10;

		int baiwei = shiweiRemain % 10;
		int baiweiRemain = shiweiRemain / 10;

		int qianwei = baiweiRemain % 10;
		//deal the data

		int total = gewei + shiwei + baiwei + qianwei;
		//compute the answer

		JOptionPane.showMessageDialog(null,total);
		//print the answer
	}
}