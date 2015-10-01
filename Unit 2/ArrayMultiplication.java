package JavaPackage.Q1;

import java.util.Scanner;

public class ArrayMultiplication 
{

	public static void main(String[] args) 
	{
		
		getMultiplication();

	}
	
	public static int[][] getMultiplication()
	{
		
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		int p = scan.nextInt();
		
		int[][] matA = new int[m][n];
		int[][] matB = new int[n][p];
		int[][] matC = new int[m][p];
		
		for(int i = 1; i <= m; i++)
		{
			
			for(int j = 1; j <= p; j++)
			{
				
				for(int k = 1; k <= n; k++)
				{
					
					matC[i][j] += matA[i][k] * matB[k][j];
					
				}
				
			}
			
		}
		
		return matC;
		
	}

}
