import javax.swing.JOptionPane;

public class Ascii_to_char{
	public static void main(String[] args){
		String deal_data = JOptionPane.showInputDialog(null,"Enter your data you want to change as integer: ","Enter your data !!",JOptionPane.QUESTION_MESSAGE);
		//Enter string data.

		int deal_data_number = Integer.parseInt(deal_data);
		//change data from string to int
		char answer_char = (char)deal_data_number;
		//change data type(to answer)

		JOptionPane.showMessageDialog(null,answer_char);
		//print the answer
	}
}