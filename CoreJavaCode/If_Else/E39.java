/*
 * 
 */
package If_Else;

import java.util.Scanner;

public class E39 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if((y>x)&&(z>y))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	
}
