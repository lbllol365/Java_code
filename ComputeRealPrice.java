import javax.swing.JOptionPane;

public class ComputeRealPrice{
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog(null,"Enter name!!","Enter data!!",JOptionPane.QUESTION_MESSAGE);
		//Get name
		
		String workTimePerweek_String = JOptionPane.showInputDialog(null,"Enter work time per week!","Enter data!!",JOptionPane.QUESTION_MESSAGE);
		//Get work time as string
		double workTimePerweek = Double.parseDouble(workTimePerweek_String);
		//make work time from string to double

		String perPrice_String = JOptionPane.showInputDialog(null,"Enter per hour price!","Enter data!!",JOptionPane.QUESTION_MESSAGE);
		//Get per hour price as string
		double perPrice = Double.parseDouble(perPrice_String);
		//make per hour price from string to double

		Sting lianbangShuiLv_String = JOptionPane.showInputDialog(null,"Enter liang bang shui lv !!","Enter data!!",JOptionPane.QUESTION_MESSAGE);
		//Get lianbang shui lv as String
		double lianbangShuiLv = Double.parseDouble(lianbangShuiLv_String);
		//make liangbang shui lv from string to double

		String zhouShuiLv_String = JOptionPane.showInputDialog(null,"Enter zhou shuilv !!","Enter data!!",JOptionPane.QUESTION_MESSAGE);
		//Get zhou shuilv as string
		double zhouShuilv = Double.parseDouble(zhouShuiLv_String);
	}
}