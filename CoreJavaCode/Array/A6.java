/*
 Write a C program to create a new array 
 containing the middle elements from the two given arrays of integers, each length 5.
 */
package Array;

import java.util.Scanner;

public class A6 {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		int mid1 =(n-1)/2;
		int mid2=(m-1)/2;
		int newA[]=new int[2];
		newA[0]=a[mid1];
		newA[1]=b[mid2];
		System.out.print(newA[0]+"  "+newA[1]);
		
		
			
		
	}
}
