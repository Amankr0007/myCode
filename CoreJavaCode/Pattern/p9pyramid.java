package pattern;

import java.util.Scanner;

public class p9pyramid {
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		PatternMethod(row);
		sc.close();
	}
	static void PatternMethod(int row)
		{
			for(int i=1;i<=row;i++)
			{
					for(int j=1; j<=row-i+1;j++)
					{
						System.out.print(j);
					}
				
				System.out.println();
			}
		
	}

}
