/*
 Write a C program to check whether a given array of integers contains 5's and 7's.
 */
package Array;
import java.util.*;
public class A24 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[] =new int[n];
		int flag=0,count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==5 || a[i]==7)
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
