/*Write a java program to check whether a character is an alphabet, digit or special character
 * 
 */
package If_Else;
import java.util.*;
public class E19 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		char ch=a.charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='z'))
				{
			System.out.println("alphabet");
				}
		else if (ch>=1 && ch<=9)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("special character");
		}
	}
		
}

