//Write a C program to check  whether a given array of integers contains no 3 or a 5.
package Array;

import java.util.Scanner;

public class A28 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int flag=1;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]!=3 || a[i]!=5)
			{
				System.out.println("true");
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("false");
		}
		
	}

}
