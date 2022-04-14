package array_main;

import java.util.Scanner;

public class A41C {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		int b[]= {1, 3, 5, 7, 9};
		for(int l=0;l<b.length;l++)
		{
			int i=0;
			while(i<n && a[i]<b[l])
			{
				i++;
			}
			if(i!=n)
			{
				System.out.println(b[l]+"celling value "+a[i]);
			}
			else
			{
				System.out.println(b[l]+"celling value -1");
			}
			i=n-1;
			while(i>=0 && a[i]>b[l])
			{
				i--;
			}
			if(i!=-1)
			{
				System.out.println(b[l]+" flooring value : "+a[i]);
			}
			else
			{
				System.out.println(b[l]+"flooring value -1");
			}
		}
		for(int num=0;num<10;num++)
		{
			int i=0;
			while(i<n && a[i]<num)
			{
				i++;
			}
			if(i!=n)
			{
				System.out.println(num+"celling value "+a[i]);
			}
			else
			{
				System.out.println(num+"celling value -1");
			}
			i=n-1;
			while(i>=0 && a[i]>num)
			{
				i--;
			}
			if(i!=-1)
			{
				System.out.println(num+" flooring value : "+a[i]);
			}
			else
			{
				System.out.println(num+"flooring value -1");
			}
		}
	}

}
