import javax.swing.JOptionPane;

public class ComputeSixMonthMoney{
	public static void main(String[] args){
		double yuanMoney = 100;
		double monthRate = 0.0047;
		double getmoney;

		getmoney = yuanMoney * (1 + monthRate);
		getmoney = getmoney * (1 + monthRate);
		getmoney = getmoney * (1 + monthRate);
		getmoney = getmoney * (1 + monthRate);
		getmoney = getmoney * (1 + monthRate);
		getmoney = getmoney * (1 + monthRate);
		//compute the answer(6 times)

		JOptionPane.showMessageDialog(null,getmoney,"Answer is : ",JOptionPane.QUESTION_MESSAGE);
		//print the answer
	}
}