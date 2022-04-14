package Basic_Coding;
import java.util.*;
public class insertion {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		insertion(a);
		Display(a);
	}
	
	static void insertion(int a[])
	{
		int j,key;
		for(int i=1;i<a.length;i++)
		{
			key=a[i];
			j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
			
		}	
	}
	static void Display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
