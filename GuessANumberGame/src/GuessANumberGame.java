// Juan P Hernandez
// Guess a number game

import javax.swing.JOptionPane;

public class GuessANumberGame 
{
	public static void main (String[] args)
	{
		
		// Variables
		int computerNum;
		String playerNumber;
		String outputMessage;
		int playerNum;
		int playerWins = 0;
		int computerWins = 0;
		int totalGames = 0;
		float playerPercentage = 0;
		String answer;
		
		
		
		do
		{
			computerNum = 0 + (int) (Math.random() * 10);
			// User input
			playerNumber = JOptionPane.showInputDialog("Enter a number between 0 and 10");
			playerNum = Integer.parseInt(playerNumber);
			
			// Process
			if ((playerNum < 0) || (playerNum > 10))
			{
				JOptionPane.showMessageDialog(null, "You entered an invalid number");
			}
			else
			{
				if (playerNum == computerNum)
				{
					JOptionPane.showMessageDialog(null, "Correct, you win");
					playerWins++;
					totalGames++;
				}
				else if (playerNum > computerNum)
				{
					JOptionPane.showMessageDialog(null, "Number is too big!");
					computerWins++;
					totalGames++;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Number is too small!");
					computerWins++;
					totalGames++;
				}
			}
			answer = JOptionPane.showInputDialog("Do you want to play again? Enter Yes or No: ");	
			
		}while (answer.equalsIgnoreCase("YES"));
		
		
		// output
		
		outputMessage = String.format("Total good guesses: %d\nTotal bad guesses: %d\nTotal games played: %d", playerWins, computerWins, totalGames);

		JOptionPane.showMessageDialog(null, outputMessage);
		//playerPercentage = ((float) playerWins / totalGames)  * 100;
		
		//System.out.printf("Player win percentage: %.2f%s", playerPercentage, "%");
		
	}
}// 