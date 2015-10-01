package JavaPackage.Q1;

import java.util.Scanner;

public class PascalTriangle 
{

	public static void main(String[] args) 
	{
		
		getPascalTriangle();

	}
	
	public static void getPascalTriangle()
	{
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();;
		
		int[][] mat = new int[n][n];
		mat[0][0] = 1;
		
		for(int i = 1; i < n; i++)
		{
			
				for(int j = 0; j < n; j++)
				{
					
					if(j == 0)
					{
						
						mat[i][j] = 1;
						
					}
					
					else
						mat[i][j] = mat[i - 1][j] + mat[i - 1][j - 1];
										
				}
		
		}
		
		for(int i = 0; i < n; i++)
		{
			
			for(int j = 0; j < i + 1; j++)
			{
				
				System.out.print(mat[i][j] + " ");
				
				
			}
			
			System.out.println();
			
		}
		
		scan.close();
		
	}
	

}
