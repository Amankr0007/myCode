/*
 * Write a C program to check whether three given integer values are in the range 20..50 inclusive. 
 * Return true if 1 or more of them are in the said range otherwise return false.
 */
package If_Else;
import java.util.*;
public class E26 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if((n1>=20 && n1<=50)||(n2>=20 && n2<=0)||(n3>=20 && n3<=50))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
	}

}
