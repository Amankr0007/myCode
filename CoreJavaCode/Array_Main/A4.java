//Write a program in C to copy the elements of one array into another array.
package array_main;

import java.util.Scanner;

public class A4 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[] = new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]+" ");
		}
		
	}

}
