import java.util.Scanner;


public class Calculator 
{
	public static void main (String[] args )
	{
		Scanner input = new Scanner (System.in);
		
		// Variables
		double numOne = 0;
		double numTwo = 0;
		double calculation = 0;
		int choice;
	
		
		// User input
		System.out.print("Enter first number: ");
		numOne = input.nextFloat();
		System.out.print("Enter second number: ");
		numTwo = input.nextFloat();
		// Output for users to chose calculation
		System.out.println("\nSimple Calculator\nEnter:\n\n1 for Addition\n2 for Substraction\n3 for Multiplication\n4 for Division\n");
		choice = input.nextInt();
		
		// Possible calculations
		if(choice == 1)
		{
			calculation = numOne + numTwo;
			System.out.printf("%s%.2f", "The sum of the two numbers is ", calculation);
		}
		else if(choice == 2)
		{
			calculation = numOne - numTwo;
			System.out.printf("%s%.2f", "The substraction of the two numbers is ", calculation);
		}
		else if(choice == 3)
		{
			calculation = numOne * numTwo;
			System.out.printf("%s%.2f", "The multiplication of the two numbers is ", calculation);
		}
		else if(choice == 4)
		{
			calculation = numOne / numTwo;
			System.out.printf("%s%.2f", "The division of the two numbers is ", calculation);
		}
	}
}
