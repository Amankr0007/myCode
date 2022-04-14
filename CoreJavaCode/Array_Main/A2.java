//Write a program in C to read n number of values in an array and display it in reverse order.
package array_main;

import java.util.Scanner;

public class A2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
