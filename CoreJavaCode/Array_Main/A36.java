package array_main;
import java.util.*;
public class A36 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		int sum_natural_number=(n*(n+1)/2);
		sum=sum-(n+1);
		int digit=sum_natural_number-sum;
		System.out.println(digit);
		
	}

}
