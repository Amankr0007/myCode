
package If_Else;

import java.util.Scanner;

public class E13 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
			if(h<150)
			{
				System.out.println("Dwarf");
			}
			else if(h>=150 && h<165)
			{
				System.out.println("Average");
			}
			else if(h>=165 && h<=195)
			{
				System.out.println("tall");
			}
			else
			{
				System.out.println("Abnormal height");
			}
	}
}
