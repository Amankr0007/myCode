package array_main;
import java.util.*;
public class matrix_left_diagonals_right_diagonals {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat[][]= new int[row][col];
		int i,j,right=0,left=0;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		if(row==col)
		{
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				right=right+mat[i][i];
				left=left+mat[i][row-i-1];
			}
		}
		System.out.println(right+" "+left);
		}
		else
		{
			System.out.println("not a square matrix");
		}
	}
}
