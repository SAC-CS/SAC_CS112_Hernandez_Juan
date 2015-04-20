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
		String playerChoice = " ";
		String answer;
		
		DiceNumber myDiceManagement = new DiceNumber(computerNum);
		
		// Process
		do
		{
			myDiceManagement.welcomeMessage();
			computerNum = myDiceManagement.getRandomNumber();	
			playerChoice = myDiceManagement.userInputMessage();
			myDiceManagement.winLoseMessage();
			
			// Debug output to make sure it's correct.
			System.out.println(playerChoice);
			System.out.println(computerNum);
			
			answer = myDiceManagement.playAgain();		
			
		}while(answer.equalsIgnoreCase("yes"));
			
		winPercentage = myDiceManagement.winPercentage(playerWins, gamesPlayed);
		playerEven = myDiceManagement.playerEven(evenGuesses, gamesPlayed);
		oddPercentage = myDiceManagement.oddPercentage(computerOdd, gamesPlayed);
		gamesPlayed = myDiceManagement.gamesPlayed();
		myDiceManagement.displayMessage(gamesPlayed, winPercentage, playerEven, oddPercentage);
	}

}
