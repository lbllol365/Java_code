import javax.swing.JOptionPane;

public class SentingValueusingConfirmationDialog{
	public static void main(String[] args){
		int sum = 0;

		int option = JOptionPane.YES_OPTION;
		while(option == JOptionPane.YES_OPTION){
			String data_string = JOptionPane.showInputDialog("Enter you integer data!!");

			int data = Integer.parseInt(data_string);

			sum += data;
			option = JOptionPane.showConfirmDialog(null,"Continue?");
		}
		JOptionPane.showMessageDialog(null,"The sum is" + sum);
	}
}