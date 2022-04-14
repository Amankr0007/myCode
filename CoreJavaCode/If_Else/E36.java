/*
 *  Write a C program to compute the sum of the two given integers. 
 *  If one of the given integer value is in the range 10..20 inclusive return 18. 
 */
package If_Else;

import java.util.Scanner;

public class E36 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum=n1+n2;
		if((n1>=10 && n1<=20) || (n2>=10 && n2<=20))
		{
			System.out.println(sum);
		}
		else
		{
			System.out.println(18);
		}
	}
	

}
