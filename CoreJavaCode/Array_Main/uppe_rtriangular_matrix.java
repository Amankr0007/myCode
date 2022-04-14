package array_main;

import java.util.Scanner;

public class uppe_rtriangular_matrix {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat[][]=new int[row][col];
		int i,j,k;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{
			for(k=0;k<i;k++)
			System.out.print("0 ");
			for(j=i;j<col;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
