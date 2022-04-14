/*
 Write a C program to check a given array of integers and return true if the array contains 10 or 20 twice. 
 The length of the array will be 0, 1, or 2.
 */
package Array;

import java.util.Scanner;

public class A12 {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int flag10=2;
		int flag20=2;
		for(int i=0;i<n;i++)
		{
			if(a[i]==10)
			{
				flag10--;
			}
			if(a[i]==20)
			{
				flag20--;
			}
		}
		if(flag10<=0 || flag20<=0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	}

}
