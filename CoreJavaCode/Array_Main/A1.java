//Write a program in C to store elements in an array and print it.
package array_main;
import java.util.*;
public class A1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		display(a);
	}
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
			
	}

}
