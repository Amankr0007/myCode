//Write a C program to check a given integer and return true if it is within 10 of 100 or 200.
package If_Else;
import java.util.*;
public class E24 {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	if((n>90 && n<=110) || (n>190 && n<=210))
			{
		System.out.println("true");
			}
	else
	{
		System.out.println("False");
	}
	
	
	}
}
