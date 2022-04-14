/*
Write a C program to create an array taking two middle elements from a given array of integers of length even.
 */
package Array;

import java.util.Scanner;

public class A10 {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int mid1=(n-2)/2;
		int mid2=mid1+1;
		int newA[]= new int[2];
		newA[0]=a[mid1];
		newA[1]=a[mid2];
		System.out.println(newA[0]+" "+newA[1]);
		
	}

}
