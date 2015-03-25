// Juan P Hernandez
// Program: Rock Paper Scissors
//
// 03/07/2015

import javax.swing.JOptionPane;

public class RockPaperScissor 
{
	public static void main (String[] args)
	{

		
		String playerChoice;
		int computerNumber = 0;
		String computerChoice;
		String answer;
		
		
		// Process
		do
		{
			
			// user input
			playerChoice = JOptionPane.showInputDialog("Enter Rock, Paper, or Scissors to play: ");	

			// Computer's random number
			computerNumber = 1 + (int) (Math.random() * 3);
			
			switch(computerNumber)
			{
			case 1: computerChoice = "rock";
				switch(playerChoice.toLowerCase())
				{
				case "rock": JOptionPane.showMessageDialog(null, "It's a tie!");
				break;
				case "paper": JOptionPane.showMessageDialog(null, "Paper beats rock, You Win!!");
				break;
				case "scissors": JOptionPane.showMessageDialog(null, "Rock beats Scissors, Computer Wins!!");
				}
			break;
			case 2: computerChoice = "paper";
				switch(playerChoice.toLowerCase())
				{
				case "rock": JOptionPane.showMessageDialog(null, "Rock beats Scissors, You Win!!");
				break;
				case "paper": JOptionPane.showMessageDialog(null, "It's a tie!");
				break;
				case "scissors": JOptionPane.showMessageDialog(null, "Scissors beat paper, You Win!!");
				}
			break;
			case 3: computerChoice = "scissors";
				switch(playerChoice.toLowerCase())
				{
				case "rock": JOptionPane.showMessageDialog(null, "Rock beats Scissors, You Win!!");
				break;
				case "paper": JOptionPane.showMessageDialog(null, "Scissors beat paper, Computer Win!!");
				break;
				case "scissors": JOptionPane.showMessageDialog(null, "It's a tie!");
				}
			break;
			default: computerChoice = " ";
			break;
			}

			answer = JOptionPane.showInputDialog("Do you want to play again, Yes or No?: ");	
		
		}while(answer.equalsIgnoreCase("yes"));
				
	}
}
