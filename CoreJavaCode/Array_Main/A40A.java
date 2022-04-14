package array_main;
import java.util.*;
public class A40A {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		for(int num=0;num<10;num++)
		{
			int i=0;
			while(i<n && a[i]<num)
			{
				i++;
			}
			if(i!=n)
			{
				System.out.println(num+"celling value "+a[i]);
			}
			else
			{
				System.out.println(num+"celling value -1");
			}
		}
	}

}
