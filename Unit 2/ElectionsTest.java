package JavaPackage.Q1;

import java.util.Arrays;
import java.util.Scanner;

public class ElectionsTest 
{

	public static void main(String[] args) 
	{
		
	System.out.println(getWinner());
		
	}
	
	public static int getWinner()
	{
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] numVote = new int[n];
		int[] cityVote = new int[n];
		
		for(int i = 0; i < m; i++)
		{
			
			for(int j = 0; j < n; j++)
			{
				
				numVote[j] = scan.nextInt();
				
			}
			
			cityVote[getMostCities(numVote)] += 1;
			
			Arrays.fill(numVote, 0);
			
		}
		
		return getMostCities(cityVote) + 1;
		
	}
	
	public static int getMostCities(int[] array)
	{
		
		int maxValue = 0;
		
		for(int i = 1; i < array.length; i++)
		{
			
			int newArrayIndex = array[i];
			
			if((newArrayIndex > array[maxValue]))
			{
				
				maxValue = i;
				
			}
			
		}
		
		return maxValue;
		
	}
}


		

