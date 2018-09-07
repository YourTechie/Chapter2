package exercises;
import java.util.Scanner;
public class FreeLance 
{
	public static void main(String[] args) 
	// TODO Auto-generated method stub
	
	{
		String firstName; 
		int num1; 
		int num2;
		int total; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name? >>");
		firstName = input.next();
		
		System.out.println("Give an integer >>");
		num1 = input.nextInt();
		
		System.out.println("Give another integer >>");
		num2 = input.nextInt();
		
		total = num1 + num2; 
		
		System.out.println("Your name is "+firstName);
		System.out.println("Your first integer is "+num1);
		System.out.println("Your second integer is "+num2);
		System.out.println("Your total integer is "+total);
		
	}

}
