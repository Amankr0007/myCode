/*
 Write a C program to rotate the elements of a given array of integers 
 (length 4 ) in left direction and return the new array
 */
package Array;

import java.util.Scanner;

public class A11 {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp=a[0];
		for(int i=0;i<=n-2;i++)
		{
			a[i]=a[i+1];
		}
		a[n-1]=temp;
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}

}
