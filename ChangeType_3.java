import javax.swing.JOptionPane;

public class ChangeType_3{
	public static void main(String[] args){
		String bangshuString = JOptionPane.showInputDialog(null,"Enter your data you want to change as a double: ","Enter you data",JOptionPane.QUESTION_MESSAGE);
		//Enter the data as string.

		double bangshu = Double.parseDouble(bangshuString);

		double qinake = bangshu * 0.454;

		JOptionPane.showMessageDialog(null,qinake);

	}
}