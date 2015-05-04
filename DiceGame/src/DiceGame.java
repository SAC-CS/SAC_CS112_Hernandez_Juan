import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) 
	{
		int finalVal = 0;
		int userGuess = 0;
		int diceValue = 0;
		int diceCount = 0;
		int diceBounces = 0;
		String answer = "No";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Let's play some dice.");
		
		Dice dicePlusGame = new Dice();

		do
		{
			// Get player number of dice and bounces.
			System.out.print("\nHow many dices do you want? ");
			diceCount = input.nextInt();
			
			System.out.print("How many bounces do you want? ");
			diceBounces = input.nextInt();
			
			// roll the dice
			finalVal = dicePlusGame.Throw(diceCount, diceBounces);
			
			// Get player guess			
			userGuess = dicePlusGame.getUserGuess();
			
			// Display Result
			dicePlusGame.displayResult();
			
			// Ask user if they want to play again
			answer = dicePlusGame.playAgain();

			
		}while (answer.equalsIgnoreCase("YES"));
		
		dicePlusGame.displayFinalResult();
		
	}

}
