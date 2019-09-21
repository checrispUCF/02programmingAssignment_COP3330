package crisp_p2;

import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int answer; 
		double bmi, weightInPounds, heightInInches, weightInKilograms, heightInMeters;
		
		System.out.println("Would you like your BMI calculated using the metric system or the imperial system?");
		System.out.print("Please enter 1 for the imperial system");
		System.out.println(" or enter 2 for the metric system now:");
		
		answer = scnr.nextInt();
		
		if (answer == 1)
		{
			System.out.println("Please enter your weight in pounds:");
			weightInPounds = scnr.nextDouble();
			
			System.out.println("Please enter your height in inches:");
			heightInInches = scnr.nextDouble();
			
			bmi = (703 * weightInPounds) / (heightInInches * heightInInches);
		}
		else 
		{
			System.out.println("Please enter your weight in kilograms:");
			weightInKilograms = scnr.nextDouble();
			
			System.out.println("Please enter your height in meters:");
			heightInMeters = scnr.nextDouble();
			
			bmi = (weightInKilograms) / (heightInMeters * heightInMeters);
		}
		
		System.out.printf("Your BMI is: %.1f\n", bmi);
		System.out.printf("\n");
		System.out.println("BMI Categories:");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		
		// 122pounds, 62inches, 55.33kilograms, 1.57meters

		scnr.close();
	}

}