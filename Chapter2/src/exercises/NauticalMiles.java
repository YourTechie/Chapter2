package exercises;
import java.util.Scanner;
public class NauticalMiles {

	public static void main(String[] args) 
	{
		double kilometers; 
		double miles; 
		double nauticalMiles; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number for Nautical Miles >> "); 
		nauticalMiles = input.nextInt();
		
		miles = nauticalMiles * 1.150779;
		kilometers = miles * 1.852;
		
		System.out.println( + nauticalMiles + " in nautical miles is " + miles + " in miles. "  + miles + " miles equal " + kilometers + " in kilometers");
		
	}
}
