package array_main;
import java.util.*;
public class A60 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][] = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int count=0,max=0,row=0;
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<m;j++)
			{
				if(a[i][j]==1)
				{
					count++;
				}
			}
			if(count>max) {
				max=count;
				row=i;
			}
		}
		System.out.print("row : "+row);
		
		
	}

}
