/*Write a C program to read the age of a candiadte and detrermine whether 
it is eligible for casting his/her own vote.
*/
package If_Else;

import java.util.Scanner;

public class E11 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Congratulation! You are eligible for casting your vote.");
		}
		else
		{
			System.out.println("not eligible");
		}
	}
}
