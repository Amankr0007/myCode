//Write a program in C to count a total number of duplicate elements in an array.
package array_main;

import java.util.Scanner;

public class A5 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int duplicate[] = new int[n];
		for(int i=0;i<n;i++)
		{
			if(duplicate[i]!=-1)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						duplicate[j]=-1;
					}
				}
			}
		}
		System.out.println("duplicate : "+count);
		
		
	}
}
