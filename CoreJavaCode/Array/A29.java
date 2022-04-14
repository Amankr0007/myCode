/*
  Write a C program to check whether an array of integers contains a 3 next to a 3 or a 5 next to a 5 or both.
 */
package Array;

import java.util.Scanner;

public class A29 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int count3=0,count5=0,i;
		for(	i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++) {
			if(a[i]==3 && a[i+1]==3) {
				count3++;
			}
			else if(a[i]==5 && a[i+1]==5) {
				count5++;
			}
		}
		if(count3>0 && count5>0)
		{
			System.out.print("both present");
		}
		else if(count3>0) {
			System.out.print("only 3");
		}
		else if(count5>0)
		{
			System.out.print("only 5");
		}
	}

}
