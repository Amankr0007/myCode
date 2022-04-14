/*
 * Write a C program to read the value of an integer m and display the value of n is 1
 * when m is larger than 0, 0 when m is 0 and -1 when m is less than 0
 */
package If_Else;
import java.util.*;
public class E12 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		if(m>0)
		{
			System.out.println("n="+1);
		}
		else if(m==0)
		{
			System.out.println("n="+0);
			
		}
		else if(m<0)
		{
			System.out.println("n="+-1);
		}
	}

}
