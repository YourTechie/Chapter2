package YouDoIt;

import java.util.Scanner;

public class IntegerDemoInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double anInt; 
		byte aByte;
		short aShort;
		long aLong;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name >> ");
		name = input.next();
		
		System.out.println("Please enter an integer >> ");
		anInt = input.nextInt();
		
		System.out.println("Please enter a byte >> ");
		aByte = input.nextByte();
		
		System.out.println("Please enter a short >> ");
		aShort = input.nextShort();
		
		System.out.println("Please enter a long >> ");
		aLong = input.nextLong();
		
		System.out.println("Your name is "+ name); 
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);
		
	}
}
