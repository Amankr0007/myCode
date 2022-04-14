//Write a program in C to print all unique elements in an array
package array_main;

import java.util.Scanner;

public class A6 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int unique[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			int count=1;
			if(unique[i]!=-1)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						unique[j]=-1;
					}
					
				}
				unique[i]=count;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(unique[i]>1)
			{
				System.out.println(a[i]+" : "+(unique[i]-1));
			}
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<n;i++)
		{
			if(unique[i]==1) {
			System.out.println(a[i]+" : "+unique[i]);
			}
		}
	
		
		
	}
}
