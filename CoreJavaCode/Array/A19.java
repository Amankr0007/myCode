/*
 Write a C program to compute the sum of values in a given array of integers except the number 17. 
 Return 0 if the given array has no integer.
 */
package Array;

import java.util.Scanner;

public class A19 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,sum=0;
		int a[]= new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		if(a[i]!=17)
		{
			sum=sum+a[i];
		
		}
		
		}
		System.out.println(sum);
		
		
		
	}

}
