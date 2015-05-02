import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) 
	{
		int finalVal = 0;
		int guessValue = 0;
		int diceValue = 0;
		int diceCount = 0;
		int diceBounces = 0;
		String answer = "No";
		
		Scanner read = new Scanner(System.in);
		
		do
		{
			
			// Get player bounces
			System.out.print("How many dices do you want? ");
			diceCount = read.nextInt();
			
			System.out.print("How many bounces do you want? ");
			diceBounces = read.nextInt();
			
			// roll the dice
			Dice gameDice = new Dice(diceBounces);
			finalVal = gameDice.Throw(diceCount, diceBounces);
			
			// Get player guess
			System.out.print("What number are you guessing? ");
			guessValue = read.nextInt();
			
			// Compare and display result
			if (guessValue == finalVal)
			{
				System.out.print("Well done! The dice rolled " + finalVal + ".");
			}
			else 
			{
				System.out.print("Sorry try again, the dice rolled " + finalVal + ".");
			}
			
			System.out.print("\nDo you want to play again? (Yes or No) ");
			answer = read.next();
			
		}while (answer.equalsIgnoreCase("Yes"));
		
	}

}
