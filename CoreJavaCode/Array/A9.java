/*
Write a C program to compute the sum of the two given arrays of integers of length 3 and
find the array which has the largest sum.
 */
package Array;

import java.util.Scanner;

public class A9 {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int sum1=0;		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		for(int i=0;i<m;i++)
		{	
			
			sum1=sum1+b[i];
			
		}
		System.out.println(sum1);
		if(sum>sum1)
		{
			System.out.println("array 1");
		}
		else
		{
			System.out.println("array 2");
		}
			
		
	}
}
