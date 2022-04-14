//Write a program in C to find two elements whose sum is closest to zero.
package array_main;
import java.util.*;
public class A45 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int i,j,sum,num1=0,num2=0;
		int min=Math.abs(a[0]+a[1]);
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				sum=Math.abs(a[i]+a[j]);
				if(sum<min)
				{
						min=sum;
						num1=a[i];
						num2=a[j];
				}
				
			}
		}
		System.out.println(num1+" , "+num2);
		
	}

}
