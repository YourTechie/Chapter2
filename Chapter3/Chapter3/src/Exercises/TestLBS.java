package Exercises;
import java.util.Scanner;
public class TestLBS {

	public static void main(String[] args) 
	{
		double weight;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much do you weigh? >>");
		weight = input.nextDouble();
		
		displayFormulas(weight);
		
	}
	public static void poundsToKilograms(double weight)
	{
		double kilograms;
		double conversionformula = weight * (1 / 2.2 );
		kilograms = conversionformula;
		
		System.out.println("Your weight in kilograms is " + kilograms);
	}	
	public static void poundsToOunces(double weight)
	{
		double ounces; 
		double conversionformula = weight * 16;
		ounces = conversionformula;
		
		System.out.println("Your weight in ounces is " + ounces);
	}
	public static void poundsToMilligrams(double weight)
	{
		double milligrams;
		double conversionformula = weight * ((1 / 2.2 ) * (1000000 / 1));
		milligrams = conversionformula;
		
		System.out.println("Your weight in milligrams is " + milligrams);
	}
	public static void displayFormulas(double weight)
	{
		poundsToKilograms(weight);
		poundsToOunces(weight);
		poundsToMilligrams(weight);
	}
}	