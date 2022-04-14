package pattern;
import java.util.*;
public class p17pyramid {
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int row = sc.nextInt();
			patternMethod(row);
		}
		static void patternMethod(int row)
		{
			int i,j,sp;
			for(i=1;i<=row;i++)
			{
				for(sp=1;sp<=i-1;sp++)
					System.out.print(" ");
				for(j=1;j<=row-i+1;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
			for(i=1;i<=row;i++)
			{
				for(sp=1;sp<=row-i;sp++)
					System.out.print(" ");
				for(j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}

}
