package array_main;
import java.util.*;
public class A61 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
	
			a[i]=sc.nextInt();
		}
		int i,j,max=a[0];
		for(i=0;i<n;i++)
		{
			int product=1;
			for(j=i+1;j<n;j++)
			{
				product=product*a[j];
				if(product>max)
				{
					max=product;
				}
			}
		}
		System.out.println("product : "+max);
	}
	

}
