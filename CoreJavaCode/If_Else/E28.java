/*
 *Write a C program to check which number nearest to the value 100 among two given integers. 
 *Return 0 if the two numbers are equal. 
 */
package If_Else;
import java.util.Scanner;
import java.math.*;
public class E28 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int diff1=Math.abs(n1-100);
		int diff2=Math.abs(100-n2);
		if(diff1>diff2)
		{
			System.out.println(n2);
		}
		else if	(diff1<diff2)
		{
			System.out.println(n1);
		}
		else if(diff1==diff2)
		{
			System.out.println("0");
		}
		else
		{
			System.out.println("false");
		}
	}
	

}
