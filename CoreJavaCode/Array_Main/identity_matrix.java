package array_main;
import java.util.*;
public class identity_matrix {
	     public static void main(String []args){
	        Scanner sc=new Scanner(System.in);
	        int row=sc.nextInt();
	        int col=sc.nextInt();
	        int i,j,r=0;
	        int mat[][]=new int[row][col];
	        for(i=0;i<row;i++)
	        {
	            for(j=0;j<col;j++)
	            {
	                mat[i][j]=sc.nextInt();
	            }
	        }
	        while(r<=row/2)
	        {
	            for(i=r;i<col-1-r;i++)
	                System.out.print(mat[r][i]+" ");
	                
	            for(i=r+1;i<row-r-1;i++)
	                System.out.print(mat[i][col-r-1]+" ");

	            for(i=col-r-2;i>=r;i--)
	                System.out.print(mat[row-1-r][i]+" ");

	            for(i=row-2-r;i>r;i--)
	                System.out.print(mat[i][r]+" ");
	        }
	     }
	}

