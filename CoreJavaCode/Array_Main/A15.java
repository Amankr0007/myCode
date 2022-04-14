//Write a program in C to delete an element at desired position from an array.
package array_main;
import java.util.*;
public class A15 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int d=sc.nextInt()-1;
		int i,j;
		j=d;
		while(j<n-1)
		{
			a[j]=a[j+1];
			j=j+1;
		}
		
		for(i=0;i<n-1;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
