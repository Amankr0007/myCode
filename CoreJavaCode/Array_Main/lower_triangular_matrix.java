/*
 				1 0 0  # * *
 				4 5 0  # # *
 				7 8 9  # # #
  
 */

package array_main;
import java.util.*;
public class lower_triangular_matrix {
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
			
			for(j=0;j<=i;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			for(k=j;k<col;k++)
			{
				System.out.print("0 ");
			}
			System.out.println();
		}
	}

}
