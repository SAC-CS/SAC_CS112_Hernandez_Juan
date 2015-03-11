// Juan P Hernandez
// Guess a number game

import java.util.Scanner;

public class GuessANumber 
{
	public static void main (String[] args)
	{
		
		// Variables
		int computerNum;
		int playerNum;
		computerNum = 0 + (int) (Math.random() * 10);
		
		Scanner input = new Scanner (System.in);
		
		// User input
		System.out.print("Enter a number between 0 and 10: ");
		playerNum = input.nextInt();
		
		// Process
		if (playerNum == computerNum)
			System.out.println("Correct, You Win!!");
		else if (playerNum > computerNum)
			System.out.println("Number is too big!");
		else
			System.out.println("Number is too small!");
		
		
		System.out.printf("%s%d", "\nPlayer's number was: ", playerNum);
		System.out.printf("%s%d", "\nComputer's number was: ", computerNum);
	}
}
