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
		int computerNum = 0;
		
		
		RandomNumber myRandomNum = new RandomNumber();
		
		computerNum = myRandomNum.GetANumber_Between_1_and_10();
		
		do
		{
			
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
				if (playerNum > computerNum)
				{
					JOptionPane.showMessageDialog(null, "Number is too big!");
					computerWins++;
					totalGames++;
				}
				else if (playerNum < computerNum)
				{
					JOptionPane.showMessageDialog(null, "Number is too small!");
					computerWins++;
					totalGames++;
				}
				else
					JOptionPane.showMessageDialog(null, "Correct, you win");
			}
			
			System.out.println(computerNum);
			
		}while (playerNum != computerNum);
		
		playerWins++;
		totalGames++;
		
		
		
		
		// output
		
		outputMessage = String.format("Total good guesses: %d\nTotal bad guesses: %d\nTotal games played: %d", playerWins, computerWins, totalGames);

		JOptionPane.showMessageDialog(null, outputMessage);
		
	}
}////