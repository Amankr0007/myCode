package array_main;
import java.util.*;
public class A33 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int flag=0;
		int f[]= new int[n];
		for(int i=0;i<n;i++)
		{
			int count=1;
			if(f[i]!=-1) {
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j]) {
					count++;
					f[j]=-1;
					}
				}
				f[i]=count;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(f[i] > n/2)
			{
				System.out.println("majority : "+a[i]);
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("No majority");
		}
	}

}
