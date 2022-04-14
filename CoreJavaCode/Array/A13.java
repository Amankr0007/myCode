/*
  Write a C program to check a given array of integers of length 3 and create a  new array. If there is a 5 in 
  the given array immediately followed by a 7 then set 7 to 1.
 */
package Array;

import java.util.Scanner;

public class A13 {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();	
		int i;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int newA[]=new int[n];
		newA[0]=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i-1]==5 && a[i]==7)
			{
				newA[i]=1;
			}
			else
			{
				newA[i]=a[i];
			}
		}
		for(i=0;i<n;i++) {
		System.out.println(newA[i]+" ");
	}
	}
}

/*
 
 n=12
     0 1 2 3 4 5 6 7 8 9 10 11 
a= { 5 6 8 4 5 7 5 6 5 7 5  5 }
newA[0]=a[0]=5

i	i<12	a[i-1]==5 && a[i]==7	newA[i]
1	1<12	a[0]=5,a[1]=6, wrong	newA[1]=6
2	2<12	a[1]=6,a[2]=8,wrong		newA[2]=8
3   3<12	a[2]=8,a[3]=4 wrong		newA[3]=4
4	4<12	a[3]=4,a[4]=5 wrong		newA[4]=5
5	5<12	a[4]=5,a[5]=7 right		newA[5]=1
6	6<12	a[5]=7,a[6]=5 wrong 	newA[6]=5
































*/