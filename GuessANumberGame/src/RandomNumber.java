
public class RandomNumber 
{
	private int computerNum;
	
	public int GetANumber_Between_1_and_10()
	{
		computerNum = 1 + (int) (Math.random() * 10);
		
		return computerNum;
	}
}
