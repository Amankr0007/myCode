package array_main;

import java.util.Scanner;

public class matrix_sum_of_rows_an_columns {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat[][]= new int[row][col];
		int colsum[] = new int[col];
		int i,j;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
			for(j=0;j<col;j++)
			{
				int sum=0;
				for(i=0;i<row;i++)
				{
					 sum=sum+mat[i][j];
				}
				colsum[j]=sum;
			}
			for(i=0;i<row;i++)
			{
				int sum=0;
				for(j=0;j<col;j++)
				{
					System.out.print(mat[i][j]+" ");
					sum=sum+mat[i][j];
				}
				System.out.println("  "+sum);
			}
			System.out.println();
			for(j=0;j<col;j++)
			{
				System.out.print(colsum[j]+" ");
			}
	}

}
