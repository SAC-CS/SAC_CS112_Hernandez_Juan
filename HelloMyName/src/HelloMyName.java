// HelloMyName.java
// Printing lines

import java.util.Scanner;

public class HelloMyName 
{
	// main method
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		int numOne;
		int numTwo;
		
		System.out.print("Enter first number: ");
		numOne = input.nextInt();
		
		System.out.print("Enter second number: ");
		numTwo = input.nextInt();
		
		System.out.printf("%d\n%d\n", numOne, numTwo);
		
	}

}