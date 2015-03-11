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
		System.out.print("Enter a number between 0 and 10: ");
		userNum = input.nextInt();
		
		// Process
		if (userNum == computerNum)
			System.out.println("Correct, You Win!!");
		if (userNum > computerNum)
			System.out.println("Number is too big!");
		if (userNum < computerNum)
			System.out.println("Number is too small!");
		
		System.out.printf("%s%d", "Computer's number was: ", computerNum);
	}
}
