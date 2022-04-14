/*
  Write a C program to count number of even elements in a given array of integers.
 */
 package Array;

import java.util.Scanner;

public class A18 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,count=0;
		int a[]= new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	    for(i=0;i<n;i++)
	    {
	    	if(a[i]%2==0)
	    	{
	    		count++;
	    	}
	    	
	    }
	    System.out.println(count);
	}
	
}
