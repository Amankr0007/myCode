//Write a program in C to find the largest sum of contiguous subarray of an array.
package array_main;
import java.util.*;
public class A35 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+a[j];
				System.out.print(sum+" ");
				if(sum>max)
				{
					max=sum;
				}
			}
		}
		System.out.println(max);
	}

}
