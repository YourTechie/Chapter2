package exercises;
import java.util.Scanner; 
public class InchesToFeet {

	public static void main(String[] args) 
	{
		int inches;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount of Inches >> ");
		inches = input.nextInt();
		 
		int feet = inches / 12; 
		int remainingInches = inches % 12; 
		
		System.out.println( + inches + " inches equals " + feet + " feet and " + remainingInches + " inches");
	}

}
