package Exercises;
import java.util.Scanner;
public class NumbersDemo {

	public static void main(String[] args) 
	{
		int x;
		int y;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input an integer >> ");
		x = input.nextInt();
		
		System.out.println("Input another integer >> ");
		y = input.nextInt();
		
		displayTwiceTheNumber(x, y);
		displayNumberPlusFive(x, y);
		displayNumberSquared(x, y);
	}
	
	public static void displayTwiceTheNumber(int x, int y)	
	{
		int x2;
		int y2;
		
		x2 = x * 2;
		y2 = y * 2;
		System.out.println("x = " + x2 + " y = " + y2);
	}
	public static void displayNumberPlusFive(int x, int y)
	{
		int x2;	
		int y2;
		
		x2 = x + 5;
		y2 = y + 5;
		System.out.println("x = " + x2 + " y = " + y2);
	}
	public static void displayNumberSquared(int x, int y)
	{
		int x2 = 2;
		int y2 = 2;
		
		x2 = x * x;
		y2 = y * y;
		System.out.println("x = " + x2 + " y = " + y2);

	}

}
