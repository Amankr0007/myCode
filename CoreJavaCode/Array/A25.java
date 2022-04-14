/*
 Write a C program to check whether the sum of all 5' in the array exactly 15 in a given array of integers.
 */
package Array;
import java.util.*;
public class A25 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,count=0;
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==5)
			{
				count++;
			}
		}
		if(count==3)
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
					
		}
		
	}

}
