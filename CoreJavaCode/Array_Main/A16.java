//Write a program in C to find the second largest element in an array.
package array_main;
import java.util.*;
public class A16 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0],second=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				second=max;
				max=a[i];			
			}
			else if(a[i]>second && a[i]<max)
			{
				second=a[i];
			}
		}
		System.out.println("second largest : "+second);

	}
	
}
