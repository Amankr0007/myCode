//Write a program in C to separate odd and even integers in separate arrays.
//count even and odd no
//create 2 arrays with length count_even ,count_odd
//store 
package array_main;

import java.util.Scanner;

public class A10 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		}
		int count_even=0,count_odd=0;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				count_even++;
			}
			if(i%2!=0)
			{
				count_odd++;
			}
		}
		int odd[] = new int[count_odd];
		int even[]= new int[count_even];
		for(int i=0,j=0,k=0;i<n;i++)//i is index for a,j is index for even,k is index for odd
		{
			if(i%2==0)
			{
				even[j]=a[i];//0 1
				j++;
			}
			if(i%2!=0)
			{
				odd[k]=a[i];//0 1
				k++;
			}
		}
		for(int i=0;i<count_odd;i++)
		{
			System.out.println("odd : "+odd[i]+" ");
		}
		for(int i=0;i<count_even;i++)
		{
			System.out.println("even : "+even[i]+" ");
		}
		
	}

}
