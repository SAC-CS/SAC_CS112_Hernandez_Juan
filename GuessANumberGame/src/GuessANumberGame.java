// Juan P Hernandez
// Guess a number game

import java.util.Scanner;

public class GuessANumberGame 
{
	public static void main (String[] args)
	{
		
		// Variables
		int computerNum;
		int playerNum;
		String answer = "Y";
		computerNum = 0 + (int) (Math.random() * 10);
		
		Scanner input = new Scanner (System.in);
		
		// User input
		System.out.print("Enter a number between 0 and 10: ");
		playerNum = input.nextInt();
		
		// Process
		do
		{
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
		
			System.out.print("\nWould you like to play again? ");
			answer = input.next();
		
		}while(answer.equalsIgnoreCase("Y"));
		

	}
}