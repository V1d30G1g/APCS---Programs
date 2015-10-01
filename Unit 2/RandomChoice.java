package JavaPackage.Q1;

import java.util.Scanner;

public class RandomChoice 
{

	public static void main(String[] args) 
	{
		
		

	}
	
	public static int choice(int[] arr)
	{
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length - 1; i++)
		{
			
			arr[i] = (int) Math.random();
			
		}
		
		return arr[(int)(arr.length * Math.random())];
		
		
		
	}

}
