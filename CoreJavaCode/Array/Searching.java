package Array;
import java.util.*;
public class Searching {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter length");
		int n= sc.nextInt();
		int a[] = new int[n];
		setMethod(a);
		int val=sc.nextInt();
		searchMethod(a,val);	
	}
	static void setMethod(int a[])
	{
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<a.length;i++)
		a[i]=sc.nextInt();
	}
	static void searchMethod(int a[], int val)
	{
		Scanner sc = new Scanner(System.in);
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==val)
			{
				System.out.print("found");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("not found");
		}
	}
	

}
