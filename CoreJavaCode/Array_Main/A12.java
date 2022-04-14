//Write a program in C to sort elements of the array in descending order.
package array_main;

import java.util.Scanner;

public class A12 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int i,j,k;
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					k=a[j];
					a[j]=a[j+1];
					a[j+1]=k;
					
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+ " ");
		}
		for(i=0;i<a.length-1;i++)
		{
			for(j=0;j<a.length-1-i;j++)
			{
				if(a[j]<a[j+1])
				{
					k=a[j];
					a[j]=a[j+1];
					a[j+1]=k;
					
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+ " ");
		}

	}
	
}
