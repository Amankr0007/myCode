package Array;
import java.util.*;
public class maxx {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int a[]= new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int h=maxMethod(a);
	System.out.println(h);

	}
	static int maxMethod(int a[])
	{
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
		if(a[i]>max)
		{
			max=a[i];
		}
		}
		return max;
		
	}
			   	}
