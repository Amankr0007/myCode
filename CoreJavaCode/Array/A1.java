package Array;
import java.util.*;
public class A1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter length:"+" ");
		int n=sc.nextInt();
		int a[] = new int[n];
		setMethod(a);
		displayMethod(a);
		sumMethod(a);
		
	}
			static void setMethod(int a[])
			{	int i;
				Scanner sc = new Scanner(System.in);
				for(i=0;i<a.length;i++)
					a[i]=sc.nextInt();
				
			}
			static void displayMethod(int a[]) {
				for(int i=0;i<a.length;i++)
					System.out.println(a[i]+" ");
			}
			static void sumMethod(int a[])
			{
				int sum=0;
				for(int i=0;i<a.length;i++)
				
					sum=sum+a[i];
				//return sum;
				System.out.print("sum:"+sum);
					
				
			}

}
