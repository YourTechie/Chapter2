package exercises;
import java.util.Scanner;
public class Dollars {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int twentyDollar;
		int tenDollar;
		int fiveDollar;
		int oneDollar;
		int dollarTotal;
		
		System.out.println("How many dollars do you have? >> ");
		dollarTotal = input.nextInt();
		
		twentyDollar = dollarTotal % 20;
		tenDollar = dollarTotal % 10;
		fiveDollar = dollarTotal % 5;
		oneDollar = dollarTotal % 1;
		
		
		
	}

}
