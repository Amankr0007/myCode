package array_main;

import java.util.Scanner;

public class A30 {
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
		int b[][] = new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		int c[][] = new int[row][col];
		int flag=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(a[i][j]!=b[i][j])
				{
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}
}
