// Juan P Hernandez
// MidTerm Program: Dice Management

import javax.swing.JOptionPane;

public class DiceManagement {

	public static void main(String[] args) 
	{
		int computerNum = 0;
		int gamesPlayed = 0;
		int playerWins = 0;
		int evenGuesses = 0;
		int computerOdd = 0;
		float winPercentage = 0;
		float playerEven = 0;
		float oddPercentage = 0;
		String playerChoice;
		String answer;
		String outputMessage;
		
		// Process
		do
		{
			JOptionPane.showMessageDialog(null, "Player throw the dice and guess wether it will be even or odd!");
			computerNum = 1 + (int) (Math.random() * 6);
			
			playerChoice = JOptionPane.showInputDialog("What do you think?\nEnter even or odd: ");
			
			if ( playerChoice.equalsIgnoreCase("even") && (computerNum == 2 || computerNum == 4 || computerNum == 6))
			{
				JOptionPane.showMessageDialog(null, "Correct, the throw was even!");
				gamesPlayed++;
				playerWins++;
				evenGuesses++;
			}
			else if ( playerChoice.equalsIgnoreCase("odd") && (computerNum == 1 || computerNum == 3 || computerNum == 5))
			{
				JOptionPane.showMessageDialog(null, "Correct, the throw was odd!");
				gamesPlayed++;
				playerWins++;
				computerOdd++;
			}
			
			else if ( playerChoice.equalsIgnoreCase("odd") && (computerNum == 2 || computerNum == 4 || computerNum == 6))
			{
				JOptionPane.showMessageDialog(null, "You lose, the throw was even!");
				gamesPlayed++;
			}
			else if ( playerChoice.equalsIgnoreCase("even") && (computerNum == 1 || computerNum == 3 || computerNum == 5))
			{
				JOptionPane.showMessageDialog(null, "You lose, the throw was odd!");
				gamesPlayed++;
				evenGuesses++;
				computerOdd++;
			}
			
			else 
				JOptionPane.showMessageDialog(null, "Invalid choice, try again.");
			
			answer = JOptionPane.showInputDialog("Do you want to play again, Yes or No?: ");
			
			
			// Debug output to make sure it's correct.
			System.out.println(playerChoice);
			System.out.println(computerNum);
			
			
		}while(answer.equalsIgnoreCase("yes"));
		
		winPercentage = ((float) playerWins / gamesPlayed) * 100;
		playerEven = ((float) evenGuesses / gamesPlayed) * 100;
		oddPercentage = ((float) computerOdd / gamesPlayed) * 100;
		
		outputMessage = String.format("Total games played: %d\nPlayer win percentage: %.0f%%\nPlayer guessed even %.0f%% of the time"
				+ "\nDice rolled odd numbers %.0f%% of the time", gamesPlayed, winPercentage, playerEven, oddPercentage);

		JOptionPane.showMessageDialog(null, outputMessage);
		
	}

}
