// Juan P Hernandez
// Program: Lunch Lab One

import java.util.Scanner;

public class LunchLabOne 
{	
	public static void main (String[] args)
	{
		int choice;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Hungry\nGet in line\nBuy lunch");
		System.out.println("Are you thirsty?\nEnter 1 if you are thirsty or 0 if you are not thirsty.");
		choice = input.nextInt();
		
		if (choice == 1)
			System.out.println("Okay, buy a coke!");
		else
			System.out.println("Okay, buy water!");
		
		System.out.println("Eat lunch\nReturn tray\nLeave");
		
		
	}
}
