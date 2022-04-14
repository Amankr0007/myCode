/*
 * Write a C program to check whether a triangle can be formed by the given value for the angles.
 */
package If_Else;
import java.util.*;
public class E18 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int a3=sc.nextInt();
		if((a1+a1+a3)==180)
		{
			System.out.println("triangle can be formed");
		}
		else
		{
			System.out.println("The triangle is not found ");
		}
	}

}
