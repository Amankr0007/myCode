/*
 Write a C program to create a new array swapping 
 the first and last elements of a given array of integers and length will be least 1.
 
 */
package Array;

import java.util.Scanner;

public class A15 {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();	
		int i;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int newA[]=new int[n];
		for(i=0;i<n-1;i++)
		{
			newA[i]=a[i];
		}
		newA[n-1]=a[0];
		newA[0]=a[n-1];
		for(i=0;i<n;i++)
		{
			System.out.println(newA[i]);
		}
			
	}

}
