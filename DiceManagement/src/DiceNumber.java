
import javax.swing.JOptionPane;

public class DiceNumber 
{
	private int randomNum;
	private float calculation;
	private int numOne;
	private int numTwo;
	private int diceChoice = 0;
	private int choicePts = 0;
	private String playerChoice;
	private String choicePoints;
	private String answer;
	private String outputMessage;
	
	
	public DiceNumber(){}
	
	public void setRandomNumber(int computerNum)
	{
		randomNum = computerNum;
	}
	

	// User Input
	public int userInputMessage()
	{
		 playerChoice = JOptionPane.showInputDialog("Player, How many dices do you want to roll? 1, 2 or 3?");
		 return diceChoice = Integer.parseInt(playerChoice);
	}
	
	public int userGuessPoints()
	{
		choicePoints = JOptionPane.showInputDialog("How many points do you think it would be?");
		 return choicePts = Integer.parseInt(choicePoints);
	}
	
	// Random Number
	public int getRandomNumber()
	{
		if(diceChoice == 1)
		{
			randomNum = 1 + (int) (Math.random() * 6);
		}
		else if(diceChoice == 2)
		{
			randomNum = 2 + (int) (Math.random() * 12);
		}
		else if(diceChoice == 3)
		{
			randomNum = 3 + (int) (Math.random() * 18);
		}
		return randomNum;
	}
	
	// Win or lose process
	public void winLoseMessage()
	{
		if ((diceChoice == 1) && (choicePts > 0) && (choicePts <= 6))
		{
			if (randomNum == choicePts)
			{
				outputMessage = String.format("Correct, you win! The dice threw %d", randomNum);
				JOptionPane.showMessageDialog(null, outputMessage);

			}
			else if (randomNum != choicePts)
			{
				outputMessage = String.format("Sorry, you lose! The dice threw %d", randomNum);
				JOptionPane.showMessageDialog(null, outputMessage);

			}		
		}

		else if ((diceChoice == 2) && (choicePts > 0) && (choicePts <= 12))
		{
			if (randomNum == choicePts)
			{
				outputMessage = String.format("Correct, you win! The dice threw %d", randomNum);
				JOptionPane.showMessageDialog(null, outputMessage);

			}
			else if (randomNum != choicePts)
			{
				outputMessage = String.format("Sorry, you lose! The dice threw %d", randomNum);
				JOptionPane.showMessageDialog(null, outputMessage);

			}
		}
		
		else if ((diceChoice == 3) && (choicePts > 0) && (choicePts <= 18))
		{
			if (randomNum == choicePts)
			{
				outputMessage = String.format("Correct, you win! The dice threw %d", randomNum);
				JOptionPane.showMessageDialog(null, outputMessage);

			}
			else if (randomNum != choicePts)
			{
				outputMessage = String.format("Sorry, you lose! The dice threw %d", randomNum);
				JOptionPane.showMessageDialog(null, outputMessage);

			}

		}
		else
			JOptionPane.showMessageDialog(null, "Invalid choice, try again.");
	}
	
	// Play again message
	public String playAgain()
	{
		return answer = JOptionPane.showInputDialog("Do you want to play again, Yes or No?: ");
	}

}
