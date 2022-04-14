package pattern;
import java.util.*;
public class p16pyramid {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int row =sc.nextInt();
			patternmethod(row);
		}
		static void patternmethod(int row)
		{int i,j,k;
				for(i=1;i<=row;i++)
				{
					for(j=1;j<=row-i+1;j++)
						System.out.print(j);
					for(k=(j-2);k>=1;k--)
						System.out.print(k);
				System.out.println();
				}
		
}
}
