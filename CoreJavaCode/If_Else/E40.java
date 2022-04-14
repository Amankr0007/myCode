/*
 * Write a C program to check three given integers and return true
 * if one of them is 20 or more less than one of the others.
 */
package If_Else;
import java.math.*;
import java.util.Scanner;

public class E40 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if((Math.abs(n1-n2)>=20) || (Math.abs(n1-n3)>=20) || (Math.abs(n2-n3)>=20)) 
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		

}
}
