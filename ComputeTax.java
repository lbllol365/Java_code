import javax.swing.JOptionPane;

public class ComputeTax{
	public static void main(String[] args){
		String option_string = JOptionPane.showInputDialog(null,"Enter your shenfen!!","Enter your data!",JOptionPane.QUESTION_MESSAGE);
		//Get option in string

		int option = Integer.parseInt(option_string);
		//make data from string to int

		String taxablePrice_string = JOptionPane.showInputDialog(null,"Enter your taxable price!!","Enter your data!!",JOptionPane.QUESTION_MESSAGE);
		//Get taxable price in string

		double taxablePrice = Double.parseDouble(taxablePrice_string);
		//make data from string to double

		double tax = 0;

		if(option == 0 ){
			if(taxablePrice <= 8350)
				tax = taxablePrice * 0.10;
			else if(taxablePrice <= 33950)
				tax = taxablePrice * 0.10 + (33950 - 8350) * 0.15;
			else if(taxablePrice <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350 )* 0.28;
			else
				tax = 8350 * 0.10 + (33950 - 8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(372950-0171550)*0.33+(taxablePrice-372950)*0.35;

		}
		else if(option == 1)
			tax = taxablePrice * 0.21;
		else if(option == 2)
			tax = taxablePrice * 0.26;
		else if(option == 3)
			tax = taxablePrice * 0.45;
		else{
			System.out.print("ERROR!!");
			System.exit(0);
		}

		System.out.print("Tax is" + (int)(tax * 100) / 100.0);
	}
}