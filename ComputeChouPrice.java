import javax.swing.JOptionPane;

public class ComputeChouPrice{
	public static void main(String[] args){
		String feiYongString = JOptionPane.showInputDialog(null,"Please enter your feiyong data as double: ","Enter your data!!",JOptionPane.QUESTION_MESSAGE);
		//Enter string data.

		double feiYong = Double.parseDouble(feiYongString);
		//change the data from string to double.

		String lilvString = JOptionPane.showInputDialog(null,"Please enter your lilv as double : ","Enter your data!!",JOptionPane.QUESTION_MESSAGE);
		//Enter data lilv as string.

		double lilv = Double.parseDouble(lilvString);
		//change the data from string to double.

		double totalPrice = feiYong * (1 + lilv);

		JOptionPane.showMessageDialog(null,totalPrice);
	}
}