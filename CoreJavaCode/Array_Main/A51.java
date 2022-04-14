//15 12 24 36 54
package array_main;
import java.util.*;
public class A51 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0],sum;
		for(int i=0;i<n;i++)
		{
			sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+a[j];
				if(sum>max)
				{
					max=sum;
				}
			}
			for(int k=0;k<i;k++)
			{
				sum=sum+a[k];
				if(sum>max)
				{
					max=sum;
				}
			}
		}
		System.out.println("sum : "+max);
	}

}
