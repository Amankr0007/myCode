package pattern;
import java.util.*;
public class p7pyramid {
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
			for(int sp=1;sp<=i-1;sp++)
				System.out.print(" ");
			for(int j=1;j<=row-i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
