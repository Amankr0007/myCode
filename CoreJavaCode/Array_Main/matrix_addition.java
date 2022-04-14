package array_main;
import java.util.*;
public class matrix_addition {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int row1=sc.nextInt();
		int col1=sc.nextInt();
		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row1][col1];
		int res[][] = new int[row][col];
		int i,j,sum=0;
		if(row==row1 && col==col1)
		{
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					mat1[i][j]=sc.nextInt();
				}
			}
			for(i=0;i<row1;i++)
			{
				for(j=0;j<col1;j++)
				{
					mat2[i][j]=sc.nextInt();
				}
			}
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					res[i][j]=mat1[i][j]+mat2[i][j];
				}
			}
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					System.out.print(res[i][j]+" ");
				}
				System.out.println();
			}
		}
			
	}

}
