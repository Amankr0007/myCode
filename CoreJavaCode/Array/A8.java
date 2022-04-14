/*
 Write a C program to check whether a given array of integers of length 2, contains 15 or 20.
 */
package Array;
import java.util.*;
public class A8 {
	public static void main(String agrs[]) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int a[]= new int[n];
	int flag=0;
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		if(a[i]==15 ||a[i]==20)
		{
			System.out.println("true");
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		System.out.println("false");
	}
	
	
	}

}
