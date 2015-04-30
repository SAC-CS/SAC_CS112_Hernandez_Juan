
public class Dice 
{
	private int mDiceCount;
	
	public Dice(int DiceCount)
	{
		this.mDiceCount = DiceCount;
	}
	
	public int RollDice()
	{
		int val = 0;
		for (int i = 0; i < mDiceCount; i++)
		{
			val = val + (int) (Math.random() * 6) + 1;
		}
		
		return val;
	}
}
 