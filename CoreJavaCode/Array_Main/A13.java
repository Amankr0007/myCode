//Write a program in C to insert New value in the array (sorted list ).
package array_main;
import java.util.*;
public class A13 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n+1];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		a[n]=sc.nextInt();
		int key=a[n];
		int j=n-1;
		while(j>=0 && a[j]>key)
		{
			a[j+1]=a[j];
			j=j-1;
		}
		a[j+1]=key;
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	

}
