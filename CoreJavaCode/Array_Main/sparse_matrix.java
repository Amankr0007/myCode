/*
       2 0 4
       0 8 0
       6 0 4
 */
package array_main;
import java.util.*;
public class sparse_matrix {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat[][]=new int[row][col];
		int i,j,k,count=0;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if(mat[i][j]==0)
				{
					count++;
				}
			}
		}
		if(count>(row*col)/2)
		{
			System.out.print("Sparse matrix");
		}
		else
		{
			System.out.print("Not an sparse matrix");
		}
		
		
	}

}
