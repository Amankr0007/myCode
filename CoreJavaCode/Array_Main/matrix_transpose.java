package array_main;
import java.util.*;
public class matrix_transpose {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat[][]= new int[row][col];
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
			for(i=0;i<row;i++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
