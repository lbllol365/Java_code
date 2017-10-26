import javax.swing.JOptionPane;

public class ComputeLoanPrice{
	public static void main(String[] args){
		String annualInterestRateString = JOptionPane.showInputDialog("Enter yearly interest rate, for example 8.25: ");
		

		double annualInterestRate = Double.parseDouble(annualInterestRateString);
		

		double monthlyInterestRate = annualInterestRate / 1200;

		String numberOfYearsString = JOptionPane.showInputDialog(null,"Enter number of years as an integer,\n for example 5 : ","Enter your data!!",JOptionPane.QUESTION_MESSAGE);
		

		int numberOfYears = Integer.parseInt(numberOfYearsString);
		

		String loanString = JOptionPane.showInputDialog(null,"Enter loan amount, for example 120000.95: ","Enter your data!",JOptionPane.QUESTION_MESSAGE);
		

		double loannumber = Double.parseDouble(loanString);
		

		double monthPayment = loannumber * monthlyInterestRate / (1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
		double totalPayment = monthPayment * numberOfYears * 12;
	

		monthPayment = (int)(monthPayment * 100) / 100.0;
		totalPayment = (int)(totalPayment * 100) / 100.0;
	

		String output = "The monthly payment is " + monthPayment + "\n The total payment is " + totalPayment;
		JOptionPane.showMessageDialog(null,output);
	



	}
}