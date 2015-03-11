// Juan P Hernandez
// Guess a number game

import java.util.Scanner;

public class GuessANumber 
{
	public static void main (String[] args)
	{
		
		// Variables
		int computerNum;
		int userNum;
		computerNum = 0 + (int) (Math.random() * 10);
		
		Scanner input = new Scanner (System.in);
		
		// User input
		System.out.println("Guess a number between 0 and 10: ");
		userNum = input.nextInt();
		
		// Process
		if (userNum == computerNum)
			System.out.println("Correct!");
		if (userNum > computerNum)
			System.out.println("Too big!");
		if (userNum < computerNum)
			System.out.println("Too small!");
	}
}
