package Tutorial;
import java.util.Scanner;
public class DemoRaise {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double salary;
		
		System.out.println("Please enter your salary");
		salary = input.nextDouble();
		
		System.out.println("Demonstrating some raises");
		predictRaise(salary);
	}
	public static void predictRaise(double salary)
	{
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE;
		System.out.println("Current salary: " + salary + " After raise: " + newSalary);

	}

}
