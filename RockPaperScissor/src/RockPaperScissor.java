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
			computerNumber = 0 + (int) (Math.random() * 2);
			
			switch(computerNumber)
			{
			case 0: computerChoice = "rock";
				switch(playerChoice.toLowerCase())
				{
				case "rock": JOptionPane.showMessageDialog(null, "It's a tie!");
				break;
				case "paper": JOptionPane.showMessageDialog(null, "Paper beats rock, You Win!!");
				break;
				case "scissors": JOptionPane.showMessageDialog(null, "Rock beats Scissors, Computer Wins!!");
				break;
				default: JOptionPane.showMessageDialog(null, "Invalid choice!");
				break;
				}
			break;
			case 1: computerChoice = "paper";
				switch(playerChoice.toLowerCase())
				{
				case "rock": JOptionPane.showMessageDialog(null, "Paper beats rock, Computer Wins!!");
				break;
				case "paper": JOptionPane.showMessageDialog(null, "It's a tie!");
				break;
				case "scissors": JOptionPane.showMessageDialog(null, "Scissors beat paper, You Win!!");
				break;
				default: JOptionPane.showMessageDialog(null, "Invalid choice!");
				break;
				}
			break;
			case 2: computerChoice = "scissors";
				switch(playerChoice.toLowerCase())
				{
				case "rock": JOptionPane.showMessageDialog(null, "Rock beats Scissors, You Win!!");
				break;
				case "paper": JOptionPane.showMessageDialog(null, "Scissors beat paper, Computer Win!!");
				break;
				case "scissors": JOptionPane.showMessageDialog(null, "It's a tie!");
				break;
				default: JOptionPane.showMessageDialog(null, "Invalid choice!");
				break;
				}
			break;
			}

			answer = JOptionPane.showInputDialog("Do you want to play again, Yes or No?: ");	
		
		}while(answer.equalsIgnoreCase("yes"));
				
	}
}
