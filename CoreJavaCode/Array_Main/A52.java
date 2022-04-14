package array_main;
import java.util.*;
public class A52 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		int count=0;
		for(int i=0;i<=n-3;i++)
		{
			for(int j=i+1;j<=n-2;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if((a[i]+a[j]>a[k]) && (a[i]+a[k]>a[j]) && (a[k]+a[j]>a[i]))
					{
						
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
