/* Write a C program to check whether two given integer values are in the range 20..50 inclusive. 
 * Return true if 1 or other is in the said range otherwise false.
 * 
 */
package If_Else;

import java.util.Scanner;

public class E27 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if((n1>=20 && n1<=50) || (n2>=20 && n2>=50))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
	}
}
