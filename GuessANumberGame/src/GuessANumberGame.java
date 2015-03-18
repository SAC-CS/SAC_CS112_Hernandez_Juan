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
		int playerWins = 0;
		int computerWins = 0;
		int totalGames = 0;
		float playerPercentage = 0;
		String answer = "Y";
		
		Scanner input = new Scanner (System.in);
		
		for (int i = 0; i < 3; i++)
		{
			computerNum = 0 + (int) (Math.random() * 10);
			// User input
			System.out.print("Enter a number between 0 and 10: ");
			playerNum = input.nextInt();
			
			// Process
			if ((playerNum < 0) || (playerNum > 10))
				System.out.println("You entered an invalid number.");
			else
			{
				if (playerNum == computerNum)
				{
					System.out.println("Correct, You Win!!");
					playerWins++;
					totalGames++;
				}
				else if (playerNum > computerNum)
				{
					System.out.println("Number is too big!");
					computerWins++;
					totalGames++;
				}
				else
				{
					System.out.println("Number is too small!");
					computerWins++;
					totalGames++;
				}
			}
		
		}
		
		
		// output
		System.out.println("\nTotal good guesses: " + playerWins);
		System.out.println("Total bad guesses: " + computerWins);
		System.out.println("Total games played: " + totalGames);
		
		playerPercentage = ((float) playerWins / totalGames)  * 100;
		
		System.out.printf("Player win percentage: %.2f%s", playerPercentage, "%");
		
	}
}