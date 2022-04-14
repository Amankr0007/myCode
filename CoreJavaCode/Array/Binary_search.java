package Array;

import java.util.Scanner;

public class Binary_search {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
		 a[i]=sc.nextInt();
		}
		int low=0;
		int high=n-1;
		int val=sc.nextInt();
		int h=binarySearch_recursive(a,low,high,val);
		
		if(h==-1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element found at index: "+ h);
		}
		h=binarySearch_iterative(a,val);
		if(h==-1)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element found at index: "+ h);
		}
		
	}
	static int binarySearch_recursive(int a[], int low, int high,int val)
	{
		if(high>=low)
		{
			int mid=(high+low)/2;
			if(a[mid]==val)
			{
				return mid;
			}
			else if(a[mid]>val)
			{
				high=mid-1;
				return binarySearch_recursive(a,low,high,val);
			}
			else if(a[mid]<val)
			{
				low=mid+1;
				return binarySearch_recursive(a,low,high,val);
			}
		}
		return-1;
	}
	
	static int binarySearch_iterative(int a[],int val)
	{
		int low=0,high= a.length-1;
		while(low<=high) {
			int mid=(high+low)/2;
			if(val==a[mid]) {
				return mid;
			}
			else if(a[mid]>val)
				high=mid-1;
			else if(a[mid]<val)
				low=mid+1;
		}
		return -1;
	}

}
