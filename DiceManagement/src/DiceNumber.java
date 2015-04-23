
import javax.swing.JOptionPane;

public class DiceNumber 
{
	private int randomNum;
	private float calculation;
	private int numOne;
	private int numTwo;
	private int gamesPlayed = 0;
	private int playerWins = 0;
	private int evenGuesses = 0;
	private int computerOdd = 0;
	private float winPercentage = 0;
	private float playerEven = 0;
	private float oddPercentage = 0;
	private String playerChoice;
	private String answer;
	private String outputMessage;
	
	
	public DiceNumber(){}
	
	public void setRandomNumber(int computerNum)
	{
		randomNum = computerNum;
	}
	
	// Random Number
	public int getRandomNumber()
	{
		randomNum = 1 + (int) (Math.random() * 6);
		
		return randomNum;
	}
	
	// Welcome Message
	public void welcomeMessage()
	{
		JOptionPane.showMessageDialog(null, "Player throw the dice and guess whether it will be even or odd!");
	}
	
	// User Input
	public String userInputMessage()
	{
		return playerChoice = JOptionPane.showInputDialog("What do you think?\nEnter even or odd: ");
	}
	
	// Play again message
	public String playAgain()
	{
		return answer = JOptionPane.showInputDialog("Do you want to play again, Yes or No?: ");
	}
	
	public float winPercentage(int numOne, int numTwo)
	{
		return winPercentage = ((float) playerWins / gamesPlayed) * 100;
	}
	
	public float playerEven(int numOne, int numTwo)
	{
		return playerEven = ((float) evenGuesses / gamesPlayed) * 100;
	}
	
	public float oddPercentage(int numOne, int numTwo)
	{
		return oddPercentage = ((float) computerOdd / gamesPlayed) * 100;
	}
	
	public int gamesPlayed()
	{
		return gamesPlayed;
	}
	
	// Win or lose process
	public void winLoseMessage()
	{
		if (playerChoice.equalsIgnoreCase("even") && (randomNum % 2 == 0))
		{
			JOptionPane.showMessageDialog(null, "Correct, the throw was even!");
			gamesPlayed++;
			playerWins++;
			evenGuesses++;
		}
		else if (playerChoice.equalsIgnoreCase("odd") && (randomNum % 2 != 0))
		{
			JOptionPane.showMessageDialog(null, "Correct, the throw was odd!");
			gamesPlayed++;
			playerWins++;
			computerOdd++;
		}
		
		else if (playerChoice.equalsIgnoreCase("odd") && (randomNum % 2 == 0))
		{
			JOptionPane.showMessageDialog(null, "You lose, the throw was even!");
			gamesPlayed++;
		}
		else if (playerChoice.equalsIgnoreCase("even") && (randomNum % 2 != 0))
		{
			JOptionPane.showMessageDialog(null, "You lose, the throw was odd!");
			gamesPlayed++;
			evenGuesses++;
			computerOdd++;
		}
		
		else 
			JOptionPane.showMessageDialog(null, "Invalid choice, try again.");
	}
	
	// Overall game summary
	public void displayMessage(int gamesPlayed, float winPercentage, float playerEven, float oddPercentage)
	{
		outputMessage = String.format("Total games played: %d\nPlayer win percentage: %.0f%%\nPlayer guessed even %.0f%% of the time"
				+ "\nDice rolled odd numbers %.0f%% of the time", gamesPlayed, winPercentage, playerEven, oddPercentage);
		
		JOptionPane.showMessageDialog(null, outputMessage);
	}
	
}
