//Write a program in C to find a subarray with given sum from the given array.
package array_main;
import java.util.Scanner;
public class A47 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt(); //45 67 13 24 56
		}
		int sum_check=sc.nextInt();
		int sum,flag=0;
		for(int i=0;i<n;i++)
		{
			sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+a[j];
				if(sum==sum_check)
				{
					display(a,i,j);
					flag=1;
				}
			}
		}
	}
    static void display(int a[],int low,int high) {
    	for(int i=low;i<=high;i++) {
    		System.out.print(a[i]+" , ");
    	}
    	System.out.println(); 
    }
}
