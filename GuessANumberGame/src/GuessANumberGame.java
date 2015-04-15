// Juan P Hernandez
// Guess a number game

import javax.swing.JOptionPane;

public class GuessANumberGame 
{
	public static void main (String[] args)
	{
		
		// Variables
		String playerNumber;
		String outputMessage;
		int playerNum;
		int playerWins = 0;
		int computerWins = 0;
		int totalGames = 0;
		String answer;
		RandomNumber computerNum = new RandomNumber();
		
		
		
		do
		{
			computerNum.GetANumber_Between_1_and_10();
			// User input
			playerNumber = JOptionPane.showInputDialog("Enter a number between 0 and 10\nYou will play until you guess the correct number");
			playerNum = Integer.parseInt(playerNumber);
			
			// Process
			if ((playerNum < 0) || (playerNum > 10))
			{
				JOptionPane.showMessageDialog(null, "You entered an invalid number");
			}
			else
			{
				if (playerNum > computerNum.GetANumber_Between_1_and_10())
				{
					JOptionPane.showMessageDialog(null, "Number is too big!");
					computerWins++;
					totalGames++;
				}
				else if (playerNum < computerNum.GetANumber_Between_1_and_10())
				{
					JOptionPane.showMessageDialog(null, "Number is too small!");
					computerWins++;
					totalGames++;
				}
			}
			
			System.out.println(computerNum.GetANumber_Between_1_and_10());
			
		}while (playerNum != computerNum.GetANumber_Between_1_and_10());
		
		playerWins++;
		totalGames++;
		
		
		JOptionPane.showMessageDialog(null, "Correct, you win");
		
		// output
		
		outputMessage = String.format("Total good guesses: %d\nTotal bad guesses: %d\nTotal games played: %d", playerWins, computerWins, totalGames);

		JOptionPane.showMessageDialog(null, outputMessage);
		
	}
}// 