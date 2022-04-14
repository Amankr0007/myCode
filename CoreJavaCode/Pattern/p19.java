package pattern;
import java.util.*;
public class p19 {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int row= sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int sp=1;sp<=row-i;sp++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
	}

}
