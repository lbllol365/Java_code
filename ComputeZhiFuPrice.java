import javax.swing.JOptionPane;

public class ComputeZhiFuPrice{
	public static void main(String[] args){
		String remainPrice_string = JOptionPane.showInputDialog(null,"Enter your remain price!!","Enter your data!!",JOptionPane.QUESTION_MESSAGE);
		//Get string data

		double remainPrice = Double.parseDouble(remainPrice_string);
		//make data from string to double

		String lilv_string = JOptionPane.showInputDialog(null,"Enter the rate!!","Enter the data!",JOptionPane.QUESTION_MESSAGE);
		//Get string rate data

		double lilv = Double.parseDouble(lilv_string);
		//make data form string to double

		double price_need_to_pay = remainPrice * (lilv / 1200);
		//Compute the answer

		JOptionPane.showMessageDialog(null,price_need_to_pay);
		//print the answer
	}
}