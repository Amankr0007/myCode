package If_Else;

import java.util.Scanner;

public class E20 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		char ch=str.charAt(0);
		
					
		 if ((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ||( ch=='A' && 
				ch=='E' || ch=='I' || ch=='O' || ch=='U'))
		{
			System.out.println("vowel");
		}
	
		else
		{
			System.out.println("consonant");
		}
				}
	}

