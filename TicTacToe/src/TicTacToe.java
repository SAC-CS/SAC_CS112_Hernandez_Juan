// Juan P Hernandez
// Program; Tic-Tac-Toe

import javax.swing.JOptionPane;

public class TicTacToe 
{	
	public static void main(String[] args)
	{
		
		String playerAChoice;
		String playerBChoice;
		String [] ticArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
		String outputMessageA;
		String outputMessageB;
		int playCount = 0;
		boolean playAgain=true;
		
		while(playAgain)
		{
			outputMessageA = String.format("Let's play tic-tac-toe\n%s  %s  %s\n%s  %s  %s\n%s  %s  %s\nPlayer A:",ticArray[0], ticArray[1], ticArray[2],
					ticArray[3], ticArray[4], ticArray[5], ticArray[6], ticArray[7], ticArray[8]);
				
			playerAChoice = JOptionPane.showInputDialog(null, outputMessageA);
			playCount++;
			
			// End game if 9 plays have been made
			if(playCount == 9)
			{
				JOptionPane.showMessageDialog(null, "It's a tie!");
				System.exit(0);
			}
			
			
			switch(playerAChoice)
			{
			case "1": ticArray[0] = "X";
			break;
			case "2": ticArray[1] = "X";
			break;
			case "3": ticArray[2] = "X";
			break;
			case "4": ticArray[3] = "X";
			break;
			case "5": ticArray[4] = "X";
			break;
			case "6": ticArray[5] = "X";
			break;
			case "7": ticArray[6] = "X";
			break;
			case "8": ticArray[7] = "X";
			break;
			case "9": ticArray[8] = "X";
			break;
			}
			
			// check to see if player A is a winner
			if((ticArray[0] == "X" && ticArray[0] == ticArray[1] && ticArray[1] == ticArray[2]) || (ticArray[3] == "X" && ticArray[3] == ticArray[4] && ticArray[4] == ticArray[5]) 
					|| (ticArray[6] == "X" && ticArray[6] == ticArray[7] && ticArray[7] == ticArray[8]) || (ticArray[0] == "X" && ticArray[0] == ticArray[3] && ticArray[3] == ticArray[6]) 
					|| (ticArray[1] == "X" && ticArray[1] == ticArray[4] && ticArray[4] == ticArray[7]) || (ticArray[2] == "X" && ticArray[2] == ticArray[5] && ticArray[5] == ticArray[8])
					|| (ticArray[0] == "X" && ticArray[0] == ticArray[4] && ticArray[4] == ticArray[8]) || (ticArray[2] == "X" && ticArray[2] == ticArray[4] && ticArray[4] == ticArray[6]))
			{
				JOptionPane.showMessageDialog(null, "Player A Wins!");
				System.exit(0);
			}
			
			outputMessageB = String.format("Let's play tic-tac-toe\n%s  %s  %s\n%s  %s  %s\n%s  %s  %s\nPlayer B:",ticArray[0], ticArray[1], ticArray[2],
					ticArray[3], ticArray[4], ticArray[5], ticArray[6], ticArray[7], ticArray[8]);
			
			playerBChoice = JOptionPane.showInputDialog(null, outputMessageB);
			playCount++;
			
			switch(playerBChoice)
			{
			case "1": ticArray[0] = "O";
			break;
			case "2": ticArray[1] = "O";
			break;
			case "3": ticArray[2] = "O";
			break;
			case "4": ticArray[3] = "O";
			break;
			case "5": ticArray[4] = "O";
			break;
			case "6": ticArray[5] = "O";
			break;
			case "7": ticArray[6] = "O";
			break;
			case "8": ticArray[7] = "O";
			break;
			case "9": ticArray[8] = "O";
			break;
			}

			// Check to see if player B is a winner
			if((ticArray[0] == "O" && ticArray[0] == ticArray[1] && ticArray[1] == ticArray[2]) || (ticArray[3] == "O" && ticArray[3] == ticArray[4] && ticArray[4] == ticArray[5]) 
					|| (ticArray[6] == "O" && ticArray[6] == ticArray[7] && ticArray[7] == ticArray[8]) || (ticArray[0] == "O" && ticArray[0] == ticArray[3] && ticArray[3] == ticArray[6]) 
					|| (ticArray[1] == "O" && ticArray[1] == ticArray[4] && ticArray[4] == ticArray[7]) || (ticArray[2] == "O" && ticArray[2] == ticArray[5] && ticArray[5] == ticArray[8])
					|| (ticArray[0] == "O" && ticArray[0] == ticArray[4] && ticArray[4] == ticArray[8]) || (ticArray[2] == "O" && ticArray[2] == ticArray[4] && ticArray[4] == ticArray[6]))
			{
				JOptionPane.showMessageDialog(null, "Player B Wins!");
				playAgain = false;
			}		
		}
	}
}
