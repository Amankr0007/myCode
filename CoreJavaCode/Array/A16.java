/*
Write a C program to create a new array of length 3 from a given array 
(length atleast 3) containing the elements from the middle of the array. 
 */
package Array;

import java.util.Scanner;

public class A16 {
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
		int mid1=mid+1;
		int mid2=mid1+1;
		int newA[]= new int[3];
		newA[0]=a[mid];
		newA[1]=a[mid1];
		newA[2]=a[mid2];
		for(i=0;i<3;i++)
		{
			System.out.println(newA[i]);
		}
		
	}

}
