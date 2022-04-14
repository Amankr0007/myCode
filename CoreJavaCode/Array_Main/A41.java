package array_main;
import java.util.*;
public class A41 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();	
		}
		int flooring=sc.nextInt();
		int i=n-1;
		while(i>=0 && a[i]>flooring)
		{
			i--;
		}
		if(i!=-1)
		{
			System.out.println(a[i]);
		}
		else
		{
			System.out.println("-1");
		}
		
	}

}
