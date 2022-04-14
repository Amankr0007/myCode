/*
 * Write a C program to check whether a given non-negative number is a multiple of 3 or 7, but not both.
 */
package If_Else;

import java.util.Scanner;

public class E35 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
			if(((n1%3==0) ||(n1%7==0)) && (n1%7!=0 || n1%3!=0))
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
	}
}
