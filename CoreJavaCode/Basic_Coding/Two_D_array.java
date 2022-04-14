package Basic_Coding;
import java.util.*;
public class Two_D_array {
				public static void main(String args[])
				{
					Scanner sc = new Scanner(System.in);
					int x=sc.nextInt();
					int y=sc.nextInt();
					int a[][]=new int[x][y];
					for(int i=0;i<x;i++)
					{
						for(int j=0;j<y;j++)
						{
							a[i][j]= sc.nextInt();
						}
						
					}
					for(int i=0;i<x;i++)
					{
						for(int j=0;j<y;j++)
						{
							System.out.print(a[i][j]+" ");
						}
						System.out.println();
					}
				}
}
