package Exercises;
import java.util.Scanner;
public class MetricConversion {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double num;
		
		System.out.println("Give a number! >>");
		num = input.nextDouble();
		
		CentimetersToInches(num);
		LitersToGallons(num);
	}
	public static void CentimetersToInches(double num)
	{
		double inches;
		inches = num * .39;
		
		System.out.println(num + " centimeters is " + inches + " in inches");
	}	
	public static void LitersToGallons(double num)
	{
		double gallons;
		gallons = num * .264;
		
		System.out.println(num + " liters is " + gallons + " in gallons");
	}
}
