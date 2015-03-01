// HelloMyName.java
// Printing lines

import java.util.Scanner;

public class HelloMyName 
{
	// main method
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		// Variables
		int numOne;
		int numTwo;
		
		// User input
		System.out.print("Enter first number: ");
		numOne = input.nextInt();
		
		System.out.print("Enter second number: ");
		numTwo = input.nextInt();
		
		// Output
		System.out.printf("Hello, you entered %d %s%d%s", numOne, " and ", numTwo, ".");
		
	}

}