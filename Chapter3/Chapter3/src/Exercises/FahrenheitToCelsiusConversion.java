package Exercises;
import java.util.Scanner;
public class FahrenheitToCelsiusConversion {

	public static void main(String[] args) 
	{
		double temp8;
		double temp12;
		double temp5;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the temp at 8:00am? ");
		temp8 = input.nextDouble();
		System.out.println("What is the temp at 12:00pm? ");
		temp12 = input.nextDouble();
		System.out.println("What is the temp at 5:00pm? ");
		temp5 = input.nextDouble();
		
		
		displayMethods(temp8, temp12, temp5);
		
	}
	
	public static void displayTemp8(double temp8)
	{
		double celsius;
		double conversionFormula = (temp8 - 32) / 1.8;
		celsius = conversionFormula; 
		
		System.out.println("The temp in celsius at 8:00am is " + celsius); 

	}
	public static void displayTemp12(double temp12)
	{
		double celsius;
		double conversionFormula = (temp12 - 32) / 1.8;
		celsius = conversionFormula; 
		
		System.out.println("The temp in celsius at 12:00pm is " + celsius);
	
	}
	public static void displayTemp5(double temp5)
	{
		double celsius;
		double conversionFormula = (temp5 - 32) / 1.8;
		celsius = conversionFormula; 
		
		System.out.println("The temp in celsius at 5:00pm is " + celsius);
		
	}
	public static void displayMethods(double temp8, double temp12, double temp5)
	{
		displayTemp8(temp8);
		displayTemp12(temp12);
		displayTemp5(temp5);
	}
}