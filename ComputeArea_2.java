import javax.swing.JOptionPane;

public class ComputeArea_2{
	public static void main(String[] args){
		final double PI = 3.1415;

		String banJingString = JOptionPane.showInputDialog(null,"Enter a data as a double data!!","Enter your data!",JOptionPane.QUESTION_MESSAGE);
		double banJing = Double.parseDouble(banJingString);

		double area = banJing * banJing * PI;

		JOptionPane.showMessageDialog(null,area);
	}
}