package array_main;
import java.util.*;
public class A32 {
			public static void main(String args[])
			{
				Scanner sc= new Scanner(System.in);
				int n=sc.nextInt();
				int a[]= new int[n];
				for(int i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
				}
				int eq=sc.nextInt();
				
				for(int i=0;i<n-1;i++)
				{
					
					for(int j=i+1;j<n;j++)
					{
						if((a[i]+a[j])==eq)
						{
							System.out.println("Pair of elements can make the given sum by the value of index "+i+" and "+j);
						}
					}
				}
			}
}
