package Exercises;
import java.util.Scanner;
public class BookstoreCredit {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String name;
		double gpa;
		double credit;
		
		
		System.out.println("What is your name? >> ");
		name = input.nextLine();
		
		System.out.println("What is your gpa? >> ");
		gpa = input.nextDouble();
		
		credit = gpa * 10;
		
		System.out.println("Hello " + name + ", your gpa is " + gpa + " which means you get bookstore "
				+ "credit of $" + credit);
	}

}
