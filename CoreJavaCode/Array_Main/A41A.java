package array_main;
import java.util.*;
public class A41A {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] =new int[n];
		for(int i=0;i<n;i++)		
		{
			a[i]=sc.nextInt();
		}
		for(int num=0;num<10;num++)
		{
			int i=n-1;
			while(i>=0 && a[i]>num)
			{
				i--;
			}
			if(i!=-1)
			{
				System.out.println(num+" flooring value : "+a[i]);
			}
			else
			{
				System.out.println(num+"flooring value -1");
			}
			
		}
	}

}
