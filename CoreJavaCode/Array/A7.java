/*
 Write a C program to create a new array taking 
 the first and last elements of a given array of integers and length one or more.
 */
package Array;
import java.util.*;
public class A7 {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int newA[] = new int[2];
		newA[0]=a[0];
		newA[1]=a[n-1];
		System.out.println(newA[0]+ " "+newA[1]);
	}

}
