package JavaPackage.Q1;

public class StaticPractice 
{

	private static int numberCount = 0;
	
	public StaticPractice()
	{
		
		numberCount++;
		
	}
	
	public static int getCount()
	{
		
		return numberCount;
		
	}
	
}
