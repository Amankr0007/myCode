package pattern;
import java.util.*;
public class Solid_rect {
	public static void main(String args[])
	{
		int row,col;
		Scanner sc = new Scanner(System.in);
		row=sc.nextInt();
		col=sc.nextInt();
		sc.close();
		patternMethod(row,col);
	}
	static void patternMethod(int row, int col)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

	
}
