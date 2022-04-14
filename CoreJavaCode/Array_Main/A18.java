//Write a program in C for a 2D array of size 3x3 and print the matrix.
package array_main;
import java.util.*;
public class A18 {
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int row=sc.nextInt();
			int col=sc.nextInt();
			int a[][] = new int[row][col];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
		}
}
