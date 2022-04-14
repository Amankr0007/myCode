/*
 Write a C program to compute the sum of the numbers in a given array except 
 those numbers starting with 5 followed by atleast one 6. Return 0 if the given array has no integer.
 */
package Array;

import java.util.Scanner;

public class A20 {

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
		sum=sum+a[0];
		for(i=1;i<n;i++)
		{
			if(a[i-1]==5 && a[i]==6)
			{
			sum=sum-a[i-1];
			}
			else
			{
			sum=sum+a[i];
			}
		}
		System.out.println("sum:"+sum);
	}
}
