package exercises;

import java.util.Scanner;

public class QuartsToGallons {

	public static void main(String[] args) 
	{
		int quartsToGallons = 4; 
		int quartsNeeded; 
		double gallonsTotal; 
		double quartsTotal; 
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please input amount of quarts used >>");
		quartsNeeded = input.nextInt();
		
		gallonsTotal = quartsNeeded / quartsToGallons;
		quartsTotal = quartsNeeded % quartsToGallons; 
	
		System.out.println("Your total gallons are " + gallonsTotal);
		System.out.println("Your remaining quarts are " + quartsTotal);
	}

}
