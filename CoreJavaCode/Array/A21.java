//Write a C program to check whether a given array of integers contains 5 next to a 5 somewhere.
package Array;

import java.util.Scanner;

public class A21 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,flag=0;
		int a[]= new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
	
		}
		for(i=0;i<n-1;i++)
		{
			if(a[i]==5 && a[i+1]==5)
			{	
				flag=1;
			}
			
		}
		if(flag==0)
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
		
	}

}
/* n-=5, flag =0
 a={5 4 5 5 6 }
   
    i		i<n-1		a[i]=5 && a[i+1]=5				print 
  	0		 0<4		a[0]=5 && a[0+1]=4 wrong		-----
  	1		 1<4		a[1]=4 && a[1+1]=5 wrong
  	2		 2<4		a[2]=5 && a[2+1]=5	    		true
  	3		 3<4		a[3]=5 && a[3+1]=6 wrong
  	4		 4<4wrong
  
  
 */
