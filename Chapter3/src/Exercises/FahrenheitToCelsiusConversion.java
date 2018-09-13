package Exercises;
import java.util.Scanner;
public class FahrenheitToCelsiusConversion {

	public static void main(String[] args) 
	{
		double temp;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the temp at 8:00am? ");
		temp = input.nextDouble();
		
		displayTemp(temp);
		
	}
	
	public static void displayTemp(double temp)
	{
		double celsius;
		double conversionFormula = (temp - 32) / 1.8;
		celsius = conversionFormula; 
		
		System.out.println("The temp in celsius at 8:00am is " + celsius); 
	}
}