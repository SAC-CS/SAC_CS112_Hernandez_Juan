// Juan P Hernandez
// Program: Rock Paper Scissors
//
// 03/07/2015

import java.util.Scanner;

public class RockPaperScissor 
{
	public static void main (String[] args)
	{
		
		Scanner input = new Scanner (System.in);
		
		int playerNumber = 0;
		String playerChoice;
		int computerNumber = 0;
		String answer;
		
		
		// Process
		do
		{
			
			// user input
			System.out.print("Enter Rock, Paper, or Scissors to play: ");
			playerChoice = input.next();
			
			
			// switch statement
			switch(playerChoice.toLowerCase())
			{
			case "rock": playerNumber = 1;
			break;
			case "paper": playerNumber = 2;
			break;
			case "scissors": playerNumber = 3;
			break;
			default: playerNumber = 0;
			break;
			}
			
			
			// Comptuer random number
			computerNumber = 1 + (int) (Math.random() * 3);
			
			if ( playerNumber == computerNumber)
				System.out.println("It's a tie!");
		
			else if ( playerNumber == 1 && computerNumber == 2)
				System.out.println("Paper beats Rock, Computer Wins!!");
		
			else if (playerNumber == 1 && computerNumber == 3)
				System.out.println("Rock beats Scissors, You Win!!");
		
			else if (playerNumber == 2 && computerNumber == 1)
				System.out.println("Paper beats Rock, You Win!!");
		
			else if (playerNumber == 2 && computerNumber == 3)
				System.out.println("Scissors beat Paper, Computer Wins!!");
		
			else if (playerNumber == 3 && computerNumber == 1)
				System.out.println("Rock beats Scissors, Computer Wins!!");
		
			else if (playerNumber == 3 && computerNumber == 2)
				System.out.println("Scissors beat Paper, You Win!!");
			else
				System.out.println("Invalid choice!");
		
			System.out.print("Do you want to play again, Y or N?: ");
			answer = input.next();
		
		}while(answer.equalsIgnoreCase("Y"));
				
	}
}
