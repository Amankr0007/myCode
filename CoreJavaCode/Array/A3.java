/*
 Write a C program to check two given arrays of integers of length 1 or more and 
 return true if they have the same first element or they have the same last element.
 */
package Array;

import java.util.Scanner;

public class A3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		if((a[0]==b[0]) || a[n-1]==b[n-1])
		{
			System.out.print("true");
			
		}
		else
		{
			System.out.print("false");
			
		}
	}

}
