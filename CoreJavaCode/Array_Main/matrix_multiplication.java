package array_main;
import java.util.*;
public class matrix_multiplication {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int rowA=sc.nextInt();
		int colA=sc.nextInt();
		int rowB=sc.nextInt();				//rowA*ColA rowB*colB
		int colB=sc.nextInt();
		int mat1[][] = new int[rowA][colA];
		int mat2[][] = new int[rowB][colB];
		int res[][] = new int[rowA][colB];
		int i,j,k;
		if(rowA==colB)
		{
			for(i=0;i<rowA;i++)
			{
				for(j=0;j<colA;j++)
				{
					mat1[i][j]=sc.nextInt();
				}
			}
			for(i=0;i<rowB;i++)
			{
				for(j=0;j<colB;j++)
				{
					mat2[i][j]=sc.nextInt();
				}
			}
			for(i=0;i<rowA;i++)
			{
				
				for(j=0;j<colB;j++)
				{
					int sum=0;
					for(k=0;k<colA;k++)
					{
						sum=sum+mat1[i][k]*mat2[k][j];
					}
					res[i][j]=sum;
				}
				
			}
			for(i=0;i<rowA;i++)
			{
				for(j=0;j<colB;j++)
				{
					System.out.print(res[i][j]+" ");
				}
				System.out.println();
			}
			
		}
	}

}
