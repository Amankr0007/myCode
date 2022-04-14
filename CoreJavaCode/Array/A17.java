/*
 Write a C program to find the largest value from first, last, 
 and middle elements of a given array of integers of odd length (atleast 1).
 */
package Array;

import java.util.Scanner;

public class A17 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int a[]= new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int mid=(n-1)/2;
		
		int max=a[0];
		
		if(a[0]>a[n-1])
		{
			max=a[0];
		}
		else
		{
			max=a[n-1];
		}
		if(a[mid]>max)
		{
			max=a[mid];
		}
		System.out.println(max);
		
	}

}
