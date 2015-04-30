
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) 
	{
		int computerVal = 0;
		int guessValue = 0;
		int diceCount = 1;
		String sAgain = "N";
		
		Scanner read = new Scanner(System.in);
		
		do
		{
			// Repeat until the user is done playing
			
			// Read number of  dices
			System.out.println("Input number of dice to roll: ");
			diceCount = read.nextInt();
			
			// roll the dice
			Dice gameDice = new Dice(diceCount);
			computerVal = gameDice.RollDice();
			
			// Get player guessa
			System.out.println("What number are you guessing? ");
			guessValue = read.nextInt();
			
			// Compare and display result
			if (guessValue == computerVal)
			{
				System.out.println("Well done! ");
			}
			else 
			{
				System.out.println("Oops...sorry! ");
			}
			
			System.out.println("Play Again?: ");
			sAgain = read.nextLine();
			
		}while (sAgain.equalsIgnoreCase("Y"));
		
	}

}
