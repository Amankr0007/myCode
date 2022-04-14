package pattern;

import java.util.Scanner;

public class p10pyramid {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
			int row = sc.nextInt();
			patternMethod(row);
			sc.close();
	}
	
	static void patternMethod(int row)
	{
		for(int i=1;i<=row;i++)
		{ 
			int p=i*2-1;
			for(int sp=1;sp<=row-i;sp++ )
				System.out.print(" ");
			for(int j=1;j<=p;j++)
	     	{
					System.out.print("1");
			}	
			
			System.out.println();
			
		}
	}

}
/*
-----*
----***
---*****
--*******
-*********
***********
*/