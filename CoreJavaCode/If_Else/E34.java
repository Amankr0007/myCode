/*
 *  Write a java program to to test whether a given non-negative number is a multiple of 13 or 
 *  it is one more than a multiple of 13.
 */
package If_Else;

import java.util.Scanner;

public class E34 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		if((n1%13==0) || (n1%13==1))
		{
			System.out.println("true");
			
		}
		else 
		{
			System.out.println("false");	
		}
	}
}
