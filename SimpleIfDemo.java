import javax.swing.JOptionPane;

public class SimpleIfDemo{
	public static void main(String[] args){
		String numberNeedDeal_string = JOptionPane.showInputDialog(null,"Enter your number !","Enter your data!!",JOptionPane.QUESTION_MESSAGE);
		//Get the string data

		int numberNeedDeal = Integer.parseInt(numberNeedDeal_string);
		//make data from string to int

		if(numberNeedDeal % 2 == 0)
			JOptionPane.showMessageDialog(null,"HiTwo!!","Answer:",JOptionPane.INFORMATION_MESSAGE);
		if(numberNeedDeal % 5 == 0)
			JOptionPane.showMessageDialog(null,"HiFive","Answer:",JOptionPane.INFORMATION_MESSAGE);
	}
}