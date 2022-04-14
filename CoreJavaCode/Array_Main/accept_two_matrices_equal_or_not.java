package array_main;
import java.util.*;
public class accept_two_matrices_equal_or_not {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int rowA=sc.nextInt();
		int colA=sc.nextInt();
		int rowB=sc.nextInt();
		int colB=sc.nextInt();
		int matA[][]= new int[rowA][colB];
		int matB[][]= new int[rowB][colB];
		int i,j,flag=0;
		for(i=0;i<rowA;i++)
		{
			for(j=0;j<colA;j++)
			{
				matA[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<rowB;i++)
		{
			for(j=0;j<colB;j++)
			{
				matB[i][j]=sc.nextInt();
			}
		}
		if(rowA==rowB && colA==colB)
		{
			for(i=0;i<rowA;i++)
			{
				for(j=0;j<colB;j++)
				{
					if(matA[i][j]!=matB[i][j])
					{
						flag=1;
						break;
					}
				}
			}
			if(flag==0)
			{
				System.out.println("matrix all elements are equal");
			}
			else
			{
				System.out.println("elements are not equal");
			}
		}
			
		}

}
