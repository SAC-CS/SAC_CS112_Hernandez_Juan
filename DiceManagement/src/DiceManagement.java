// Juan P Hernandez
// MidTerm Program: Dice Management

import javax.swing.JOptionPane;

public class DiceManagement {

	public static void main(String[] args) 
	{
		int computerNum = 0;
		int playerChoice = 0;
		int choicePts = 0;
		String answer = " ";
		
		DiceNumber myDiceManagement = new DiceNumber();
		
		// Process
		do
		{	
			playerChoice = myDiceManagement.userInputMessage();
			choicePts = myDiceManagement.userGuessPoints();
			computerNum = myDiceManagement.getRandomNumber();
			myDiceManagement.winLoseMessage();
			
			// Debug output to make sure it's correct.
			System.out.println(playerChoice);
			System.out.println(choicePts);
			System.out.println(computerNum);
			
			answer = myDiceManagement.playAgain();		
			
		}while(answer.equalsIgnoreCase("yes"));
			
	}

}//////
