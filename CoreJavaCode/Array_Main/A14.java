//Write a program in C to insert New value in the array (unsorted list ).
package array_main;
import java.util.*;
public class A14 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		for(int i=0;i<n;i=i+1)
		{
			a[i]=sc.nextInt();
		}
		a[n]=sc.nextInt();
		int pos = sc.nextInt()-1;
		int key=a[n];
		int i,j;
		j=n-1;
		while(j>=pos)
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
		for(i=0;i<=n;i++)
		{
			System.out.println(a[i]+" ");
		}
		

	}
	

}
