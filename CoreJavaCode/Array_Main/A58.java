package array_main;

import java.util.Scanner;

public class A58 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int i,zero=n,temp;
		for(i=0;i<zero;i++)
		{
			if(a[i]==0)
			{
				zero--;
				temp=a[i];
				a[i]=a[zero];
				a[zero]=temp;
				i--;
			}
			
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
