// Juan P Hernandez
// Program: Rock Paper Scissors
//computerPlayer = 1 + (int) (Math.random() * 3);
// 03/07/2015

import java.util.Scanner;

public class RockPaperScissor 
{
	public static void main (String[] args)
	{
		
		Scanner input = new Scanner (System.in);
		
		int userPlayer;
		int computerPlayer;
		
		
		computerPlayer = 2;
		
		
		// User input
		System.out.println("Player, enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
		userPlayer = input.nextInt();
		
		// Process
		if ( userPlayer == computerPlayer)
			System.out.println("It's a tie!");
		
		else if ( userPlayer == 1 && computerPlayer == 2)
			System.out.println("Paper beats Rock, Computer Wins!!");
		
		else if (userPlayer == 1 && computerPlayer == 3)
			System.out.println("Rock beats Scissors, You Win!!");
		
		else if (userPlayer == 2 && computerPlayer == 1)
			System.out.println("Paper beats Rock, You Win!!");
		
		else if (userPlayer == 2 && computerPlayer == 3)
			System.out.println("Scissors beat Paper, Computer Wins!!");
		
		else if (userPlayer == 3 && computerPlayer == 1)
			System.out.println("Rock beats Scissors, Computer Wins!!");
		
		else if (userPlayer == 3 && computerPlayer == 2)
			System.out.println("Scissors beat Paper, You Win!!");
				
	}
}
// Very good, Juan!
