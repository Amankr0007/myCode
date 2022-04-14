/*
 *Write a C program to find the larger from two given integers.However if the two integers 
 *have the same remainder when divided by 5, then the return the smaller integer. 
 *If the two integers are the same, return 0. 
 */
package If_Else;
import java.util.*;
public class E41 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1==n2)
		{
			System.out.println(0);
		}
		else if(n1%5==n2%5)
		{
			if(n1<n2)
			{
				System.out.println(n1);
			}
			else 
			{
				System.out.println(n2);
			}
		}
		else if(n1>n2)
		{
			System.out.println(n1);
		}
		else {
			System.out.println(n2);
		}
	
			
		}
		
	

}
