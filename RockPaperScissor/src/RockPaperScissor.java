// Juan P Hernandez
// Program: Rock Paper Scissors
//
// 03/07/2015

import java.util.Scanner;

import javax.swing.JOptionPane;

public class RockPaperScissor 
{
	public static void main (String[] args)
	{
		
		Scanner input = new Scanner (System.in);
		
		int playerNumber = 0;
		String playerChoice;
		int computerNumber = 0;
		String computerChoice;
		String answer;
		
		
		// Process
		do
		{
			
			// user input
			playerChoice = JOptionPane.showInputDialog("Enter Rock, Paper, or Scissors to play: ");	
			
			// switch statement
			switch(playerChoice.toLowerCase())
			{
			case "rock": playerChoice = "r";
			break;
			case "paper": playerChoice = "p";
			break;
			case "scissors": playerChoice = "s";
			break;
			default: playerNumber = 0;
			break;
			}
			
			
			// Computer's random number
			computerNumber = 1 + (int) (Math.random() * 3);
			
			switch(computerNumber)
			{
			case 1: computerChoice = "r";
			break;
			case 2: computerChoice = "p";
			break;
			case 3: computerChoice = "s";
			break;
			default: computerChoice = " ";
			break;
			}
			// rock = 1, paper = 2, scissors = 3
			
			if ( playerChoice == computerChoice)
				JOptionPane.showMessageDialog(null, "It's a tie!");
			else if ( playerChoice.equals("r") && computerChoice.equals("p"))
				JOptionPane.showMessageDialog(null, "Paper beats Rock, Computer Wins!!");
		
			else if (playerChoice.equals("r") && computerChoice.equals("s"))
				JOptionPane.showMessageDialog(null, "Rock beats Scissors, You Win!!");
		
			else if (playerChoice.equals("p") && computerChoice.equals("r"))
				JOptionPane.showMessageDialog(null, "Paper beats rock, You Win!!");
		
			else if (playerChoice.equals("p") && computerChoice.equals("s"))
				JOptionPane.showMessageDialog(null, "Scissors beat Paper, Computer Wins!!");
		
			else if (playerChoice.equals("s") && computerChoice.equals("r"))
				JOptionPane.showMessageDialog(null, "Rock beats Scissors, Computer Wins!!");
		
			else if (playerChoice.equals("s") && computerChoice.equals("p"))
				JOptionPane.showMessageDialog(null, "Scissors beat Paper, You Win!!");
			else
				System.out.println("Invalid choice!");
		
			answer = JOptionPane.showInputDialog("Do you want to play again, Yes or No?: ");	
		
		}while(answer.equalsIgnoreCase("yes"));
				
	}
}
