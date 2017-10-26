import javax.swing.JOptionPane;

public class StaffDataDeal{
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog(null,"Enter staff's name!","Enter the data!!",JOptionPane.QUESTION_MESSAGE);
		//Get name

		String workTimePerWeek_string = JOptionPane.showInputDialog(null,"Enter staff's work time per week!","Enter the data!!",JOptionPane.QUESTION_MESSAGE);
		//Get work time per week as string
		double workTimePerWeek = Double.parseDouble(workTimePerWeek_string);
		//make data from string to double

		String payPerHour_string = JOptionPane.showInputDialog(null,"Enter staff's payment per hour!!","Enter the data!!",JOptionPane.QUESTION_MESSAGE);
		//Get payment per hour as string
		double payPerHour = Double.parseDouble(payPerHour_string);
		//make data from string to double

		String unitRate_string = JOptionPane.showInputDialog(null,"Enter unit's rate as double!!","Enter your data!",JOptionPane.QUESTION_MESSAGE);
		//Get unit's rate as string
		double unitRate = Double.parseDouble(unitRate_string);
		//make data from string to double

		String provinceRate_string = JOptionPane.showInputDialog(null,"Enter province's rate!!","Enter your data!!",JOptionPane.QUESTION_MESSAGE);
		//Get province's rate as string
		double provinceRate = Double.parseDouble(provinceRate_string);
		//make data from string to double

		double total_without_rate_pay = workTimePerWeek * payPerHour;
		//compute the total payment without rate

		double decreaseForUnitRate = total_without_rate_pay * unitRate;
		//compute the decrease money because of unit's rate

		double decreaseForProvinceRate = total_without_rate_pay * provinceRate;
		//compute the decrease money beacause of province rate

		double realPayment = total_without_rate_pay - decreaseForProvinceRate - decreaseForUnitRate;
		//compute the money which the staff get finally

		JOptionPane.showMessageDialog(null,name,"staff's name",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,total_without_rate_pay,"the money without rate:",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,decreaseForProvinceRate,"the decrease money for province rate",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,decreaseForUnitRate,"the decrease money for unit rete : ",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,realPayment,"the money you get finally: ",JOptionPane.PLAIN_MESSAGE);
		//print the answer
	}
}