/*
 * Write a C program to check whether two given integers are in the range 40..50 inclusive,
 *or they are both in the range 50..60 inclusive.
 */
package If_Else;
import java.util.*;
public class E30 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if((n1>=40 && n1<=50) || (n2>=40 && n2<=50))
		{
			System.out.println(1);
		}
		else if((n1>=50 && n1<=60) || (n2>=50 && n2<=60))
		{
			System.out.println(2);
		}
		else  
		{
			System.out.println(3);
		}
	}

}
