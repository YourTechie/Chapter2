package exercises;
import java.util.Scanner; 
public class Eggs {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int dozenEggs; 
		int singleEgg; 
		double dozenEggCost = 3.25; 
		double singleEggCost = .45;
		int eggsTotal; 
		double eggsCost; 
		System.out.println("How many eggs are ordered? >> ");
		eggsTotal = input.nextInt();
		
		dozenEggs = eggsTotal / 12;
		singleEgg = eggsTotal % 12;
		
		eggsCost = dozenEggs * dozenEggCost + singleEgg * singleEggCost;
		
		System.out.println("You ordered " + eggsTotal + " Eggs. Thats " + dozenEggs + " dozen eggs at "
				+ dozenEggCost + " per dozen and " + singleEgg + " loose eggs at " + singleEggCost + " cents each for a total of "
						+ eggsCost + ".");
						 
		

	}

}
