//Write a program in C to find the two repeating elements in a given array.
package array_main;
import java.util.*;
public class A44 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int f[] = new int[n];
		for(int i=0;i<n;i++)
		{
			int count=1;
			if(f[i]!=-1)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						f[i]=-1;
					}
					f[i]=count;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(f[i]>1)
			{
			   System.out.println(a[i]+" ");
			}
		}
	}

}
