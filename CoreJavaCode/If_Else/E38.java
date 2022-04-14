/*
 *Write a C program to check whether it is possible to add 
 *two integers to get the third integer from three given integers. 
 */
package If_Else;

import java.util.Scanner;

public class E38 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(((n1+n2)==n3) || ((n1+n3)==n2)|| ((n2+n3)==n1))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
