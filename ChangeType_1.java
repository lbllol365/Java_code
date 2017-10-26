import javax.swing.JOptionPane;

public class ChangeType_1{
	public static void main(String[] args){
		String e_meterString = JOptionPane.showInputDialog(null,"Please enter your data you want to change as double : ","Enter your data!!",JOptionPane.QUESTION_MESSAGE);

		double e_meter = Double.parseDouble(e_meterString);

		double b_meter = e_meter * 0.305;

		JOptionPane.showMessageDialog(null,b_meter);
	}
}