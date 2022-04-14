package pattern;
import java.util.*;
public class Half_pyramid {
	public static void main(String args[]) 
	{
		/*Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		PatternMethod(row);
		sc.close();*/
		PatternMethod(7);
	}
	static	void PatternMethod(int row)
		{
			for(int i=row;i>=1;--i)
			{
				for(int j=1;j<=row+1-i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}																																												
}
