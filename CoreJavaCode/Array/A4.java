/*
  Write a C program to compute the sum of the elements of a given  array of integers.
 */
package Array;

import java.util.Scanner;


public class A4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		
	}
}
