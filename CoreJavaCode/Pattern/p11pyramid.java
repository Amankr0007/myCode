package pattern;

import java.util.Scanner;

public class p11pyramid {
	public static void main(String args[]) 
	{
		/*Scanner sc = new Scanner(System.in);
			int row = sc.nextInt();
			patternMethod(row);
			sc.close();*/
		int row=5;
		patternMethod(row);
	}
	
	static void patternMethod(int row)
	{
		for(int i=1;i<=row;i++)
		{ 
			int p=(row-i)*2+1;
			
			for(int sp=1;sp<=i-1;sp++ )
			
				System.out.print(" ");
			
			for(int j=1;j<=p;j++)
	     	{
					System.out.print("*");
			}	
			
			System.out.println();
			
		}

	}

}
