/*
 Write a C program to check whether a given array of integers contains 5's and 7's.
 */
package Array;

import java.util.Scanner;

public class A22 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,flag=0;
		int a[]= new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
	
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==5 || a[i]==7)
			{
				
				flag=1;
				
			}
		}
		if(flag==1)
		{
		System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
