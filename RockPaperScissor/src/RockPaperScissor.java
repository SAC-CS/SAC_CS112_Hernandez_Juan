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
			case "rock": playerChoice = "rock";
			break;
			case "paper": playerChoice = "paper";
			break;
			case "scissors": playerChoice = "scissors";
			break;
			default: playerNumber = 0;
			break;
			}
			
			
			// Computer's random number
			computerNumber = 1 + (int) (Math.random() * 3);
			
			switch(computerNumber)
			{
			case 1: computerChoice = "rock";
			break;
			case 2: computerChoice = "paper";
			break;
			case 3: computerChoice = "scissors";
			break;
			default: computerChoice = " ";
			break;
			}
			// rock = 1, paper = 2, scissors = 3
			
			if ( playerChoice == computerChoice)
				JOptionPane.showMessageDialog(null, "It's a tie!");
			else if ( playerChoice.equals("rock") && computerChoice.equals("paper"))
				JOptionPane.showMessageDialog(null, "Paper beats Rock, Computer Wins!!");
		
			else if (playerChoice.equals("rock") && computerChoice.equals("scissors"))
				JOptionPane.showMessageDialog(null, "Rock beats Scissors, You Win!!");
		
			else if (playerChoice.equals("paper") && computerChoice.equals("rock"))
				JOptionPane.showMessageDialog(null, "Paper beats rock, You Win!!");
		
			else if (playerChoice.equals("paper") && computerChoice.equals("scissors"))
				JOptionPane.showMessageDialog(null, "Scissors beat Paper, Computer Wins!!");
		
			else if (playerChoice.equals("scissors") && computerChoice.equals("rock"))
				JOptionPane.showMessageDialog(null, "Rock beats Scissors, Computer Wins!!");
		
			else if (playerChoice.equals("scissors") && computerChoice.equals("paper"))
				JOptionPane.showMessageDialog(null, "Scissors beat Paper, You Win!!");
			else
				System.out.println("Invalid choice!");
		
			answer = JOptionPane.showInputDialog("Do you want to play again, Yes or No?: ");	
		
		}while(answer.equalsIgnoreCase("yes"));
				
	}
}
