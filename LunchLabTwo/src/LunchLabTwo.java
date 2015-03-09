// Juan P Hernandez
// Program: Lunch Lab Two

import java.util.Scanner;

public class LunchLabTwo 
{
	public static void main (String[] args)
	{
		int choice = 0;
		int choiceTwo = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Hungry\nGet in line\nBuy lunch");
		
		// User input
		System.out.println("Are you thirsty?\nEnter 1 if you are thirsty or 0 if you are not thirsty.");
		choice = input.nextInt();
		
		// Process
		if (choice == 1)
		{
			System.out.println("Have you had breakfast?\nEnter 1 if you had breakfast or 0 if you have not.");
			choiceTwo = input.nextInt();
			if (choiceTwo == 1)
				System.out.println("Okay, buy a diet coke!");
			else if (choiceTwo == 0)
				System.out.println("Okay, buy a coke!");
		}
		else
			System.out.println("Okay, buy water!");

		System.out.println("Eat lunch\nReturn tray\nLeave");
		
		
	}
}
