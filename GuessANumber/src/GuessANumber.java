// Juan P Hernandez
// Guess a number game

import java.util.Scanner;

public class GuessANumber 
{
	public static void main (String[] args)
	{
		
		// Variables
		int computerNum;
		int playerNum;
		String answer;
		computerNum = 0 + (int) (Math.random() * 10);
		
		Scanner input = new Scanner (System.in);
		
		// User input
		System.out.print("Enter a number between 0 and 10: ");
		playerNum = input.nextInt();
		
		// Process
		if ((playerNum < 0) || (playerNum > 10))
			System.out.println("You entered an invalid number.");
		else
		{
			if (playerNum == computerNum)
				System.out.println("Correct, You Win!!");
			else if (playerNum > computerNum)
				System.out.println("Number is too big!");
			else
				System.out.println("Number is too small!");
		}
		
		System.out.println("\nPlayer's number was: " + playerNum);
		System.out.println("\nComputer's number was: " + computerNum);
		
		System.out.print("\n\nWould you like to play again? ");
		answer = input.next();
		answer = answer.toUpperCase();
		
		if (answer.equals("Y"))
			System.out.println("Okay, just run the program again.");
		else
			System.out.println("Goodbye!");
	}
}
