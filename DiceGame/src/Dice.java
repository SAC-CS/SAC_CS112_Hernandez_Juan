import java.util.Scanner;


public class Dice 
{
	private int diceValue;
	private int bounces;
	private int dices;
	private int finalValue;
	private int totalThrows;
	private int userGuess;
	private int userWins;
	private int computerWins;
	private String answer;
	
	Scanner input = new Scanner(System.in);
	// Good, but please see if you can have a constructor for user to initialized bounces when they instantiate the Dice object.
	public Dice()
	{
		this.bounces = 1;
		this.dices = 1;
	}
	
	public int getUserGuess()
	{
		// Get player guess
		System.out.print("What number are you guessing? ");
		userGuess = input.nextInt();
		
		return userGuess;
	}

	public int Throw(int dices, int bounces)
	{
		totalThrows++;
		int diceAverage = 0;
		int bounceSum = 0;
		
		for (int i = 0; i < dices; i++)
		{
			bounceSum = 0;
			for (int j = 0; j < bounces; j++)
			{
				diceValue = (int) (Math.random() * 6) + 1;
				bounceSum = bounceSum + diceValue;
				//Debug
				//System.out.printf("Bounces Sum %d\n", bounceSum);
			}
			diceAverage = diceAverage + (bounceSum / bounces);
			//Debug
            //System.out.printf("Bounces value %d\n", bounces);
            //System.out.printf("Average dicesSum %d\n", diceAverage);
		}
		
		finalValue = diceAverage / dices;
		//System.out.printf("Average %d\n", finalValue);
		return finalValue;
	}
	
	public int getValue()
	{
		return finalValue;
	}
	
	public int getTotalThrows()
	{
		return totalThrows;
	}
	
	public void displayResult()
	{
		// Compare and display result
		if (userGuess == finalValue)
		{
			System.out.print("You Win! The dice rolled " + finalValue + ".");
			userWins++;
			//Debug
			//System.out.print("\nUser wins: " + userWins + ".");
		}
		else 
		{
			System.out.print("You lose, the dice rolled " + finalValue + ".");
			computerWins++;
			//Debug
			//System.out.print("\nComputer wins: " + computerWins + ".");
		}
	}
	
	// Play again message
	public String playAgain()
	{
		System.out.print("\nDo you want to play multiple dices again? (Yes or No) ");
		answer = input.next();
		
		return answer;
	}
	
	public void displayFinalResult()
	{
		System.out.println("\nThese are the final results:");
		System.out.println("The total number of throws were: " + totalThrows);
		System.out.println("Total number of user wins: " + userWins);
		System.out.println("Total number of comptuer wins: " + computerWins);
	}
}
 
