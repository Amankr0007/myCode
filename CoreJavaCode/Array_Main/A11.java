//Write a program in C to sort elements of array in ascending order.
package array_main;

import java.util.Scanner;

public class A11 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int j,key;
		for(int i=0;i<n;i++)
		{
			key=a[i];
			j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}

}
