package Exercises;
import java.util.Scanner;
public class Percentages2 {

	public static void main(String[] args) 
	{
		double x;
		double y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give a double >> ");
		x = input.nextDouble();
		System.out.println("Give another double >> ");
		y = input.nextDouble();
		
		ComputePercent(x, y);
	}
	public static void ComputePercent(double x, double y)
	{
		double compute;
		
		compute = (x / y) * 100;
		System.out.println(x + " divided by " + y + " = " + compute + "%");
	}
}
