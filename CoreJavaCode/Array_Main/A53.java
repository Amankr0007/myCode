package array_main;
import java.util.*;
public class A53 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count_number=sc.nextInt();
		int f[] = new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==count_number)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
