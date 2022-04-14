/*
 *  Write a C program that accept two integers and return true 
 *  if either one is 5 or their sum or difference is 5.
 */

 package If_Else;
 import java.util.*;
 import java.math.*;

public class E33 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if((n1==5 || n2==5) || (n1+n2==5) || (Math.abs(n2-n1)==5))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
