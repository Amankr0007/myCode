/* Write a java program to find the larger value from two positive integer values that is in 
 * the range 20..30 inclusive, or return 0 if neither is in that range.
 */
package If_Else;
import java.util.*;
public class E31 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if((n1>=20 && n1<=30) && (n2>=20 && n2<=30))
		{
			if(n1>n2)
			{
				System.out.println(n1);
			}
			else
			{
				System.out.println(n2);
			}
		}
		else if(n1>=20 && n1<=30)
		{
			System.out.println(n1);
		}
		else if(n2>=20 && n2<=30)
		{
			System.out.println(n2);
		}
		else
		{
			System.out.println(0);
		}
		
		
	}

}
