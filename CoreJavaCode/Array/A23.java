package Array;

import java.util.Scanner;

public class A23 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,flag=0, count=0,count1=0;
		int a[]= new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
	
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==5)
			{	
				count++;
			}
			if(a[i]==7)
			{	
				count1++;
			}
		}
		System.out.println("count 5:"+count);
		System.out.println("count 7:"+count1);
		if(count>0 || count1>0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
