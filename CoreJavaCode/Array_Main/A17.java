//Write a program in C to find the second smallest element in an array.
package array_main;

import java.util.Scanner;

public class A17 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0],second=9999;
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
			{
				second=min;
				min=a[i];			
			}
			else if(a[i]<second && a[i]>min)
			{
				second=a[i];
			}
		}
		System.out.println("second smallest : "+second);

	}

}
