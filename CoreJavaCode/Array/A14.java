/*
 *  Write a C program to create a new array from two given array of integers, each length 3.
 */
package Array;

import java.util.Scanner;

public class A14 {
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
		
		int b[]=new int[n];
		for(i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		int newA[] =new int[2*n];
		for(i=0;i<n;i++)
		{
			newA[i]=a[i];
		}
		for(i=0;i<n;i++)
		{
			newA[i+n]=b[i];
		}
		for(i=0;i<2*n;i++)
		{
			System.out.println(newA[i]);
		}
	}

}

/*
 n=5
 a={1,2,3,4,5}
 b={6,7,5,9,10}
 newA[10 length]
  i=0 		i<n 	newA[i]=a[i]			newA[i+n]=b[i]	
   0        0<5		newA[0]=a[0]=1			--------------
   1		1<5		newA[1]=a[1]=2			--------------	
   2		2<5		newA[2]=a[2]=3			--------------	
   3		3<5		newA[3]=a[3]=4			--------------	
   4		4<5		newA[4]=a[4]=5			--------------
   5	5<5wrong 	--------------------------------------					
   
   0		0<5		--------------			newA[0+5]=b[0]=6
   1		1<5		--------------			newA[1+5]=b[1]=7
   2		2<5		--------------			newA[2+5]=b[2]=8
   3		3<5		--------------			newA[3+5]=b[3]=9
   4		4<5		--------------			newA[4+5]=b[4]=10
   5		5<5wrong--------------          -----------------
   
   newA={1,2,3,4,5,6,7,8,9,10}
   
   
 
 */
