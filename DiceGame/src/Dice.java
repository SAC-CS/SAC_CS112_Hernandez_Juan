
public class Dice 
{
	private int diceValue = 0;
	private int bounces;
	private int finalValue;
	private int totalThrows;
	
	public Dice(int bounces)
	{
		this.bounces = bounces;
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
				System.out.printf("Bounces Sum %d\n", bounceSum);
			}
			diceAverage = diceAverage + (bounceSum / bounces);
            System.out.printf("bounces value %d\n", bounces);
            System.out.printf("Average dicesSum %d\n", diceAverage);
		}
		
		finalValue = diceAverage / dices;
		System.out.printf("Average %d\n", finalValue);
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
}
 