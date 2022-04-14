/*
 * Write a C program to compute the sum of three given integers. 
 * If the two values are same return the third value.
 */
package If_Else;

import java.util.Scanner;

public class E42 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int sum=n1+n2+n3;
		if(n1==n2)
		{
			System.out.println(n3);
		}
		else if(n1==n3)
		{
			System.out.println(n2);
		}
		else if(n2==n3)
		{
			System.out.println(n1);
		}
		else
		{
					System.out.println(sum);
		}
		
	}
	

}
