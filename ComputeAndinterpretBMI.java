import java.util.Scanner;

public class ComputeAndinterpretBMI{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your weight");
		double weight = input.nextDouble();
		//Get weight data

		System.out.print("Enter your height");
		double height = input.nextDouble();
		//Get height data

		final double KILOGRAMS_PER_POUNT = 0.45359237;
		final double METER_PER_INCH = 0.0254;
		//set change data standard

		double weightInKilograms = weight * KILOGRAMS_PER_POUNT;
		double heightInMeters = height * METER_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		//Compute the BMI

		System.out.print("your BMI is " + bmi);
		if(bmi < 16)
			System.out.print("you are seriously underweight");
		else if(bmi < 18)
			System.out.print("You are underweight");
		else if(bmi < 24)
			System.out.print("You are normal weight");
		else if(bmi < 29)
			System.out.print("You are overweight");
		else if(bmi < 35)
			System.out.print("You are seriously overweight");
		else
			System.out.print("You are gravely overweight");
	}
}