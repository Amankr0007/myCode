// Write a program in C to merge two arrays of same size sorted in decending order.
package array_main;
import java.util.*;
public class A7 {
	 public static void main(String []args){
	       Scanner sc = new Scanner(System.in);
	       int n=sc.nextInt();
	       int m=sc.nextInt();
	       int a[] = new int[n];
	       int i,j;
	       for(i=0;i<n;i++)
	       {
	           a[i]=sc.nextInt();
	       }
	       int b[] = new int[m];
	       for( i=0;i<m;i++)
	       {
	           b[i]=sc.nextInt();
	       }
	       int c[] = new int[m+n];
	       int k=0;
	       for(i=n-1,j=m-1;i>=0 && j>=0;k++)
	       {
	    	   if(a[i]>b[j])
	    	   {
	    		   c[k]=a[i];
	    		   i--;
	    	   }
	    	   else
	    	   {
	    		   c[k]=b[j];
	    		   j--;
	    	   }
	       }
	       for(;i>=0;i--) {
	    	   c[k]=a[i];
	    	   k++;
	       }
	       for(;j>=0;j--)
	       {
	    	   c[k]=b[j];
	    	   k++;
	       }
	       for(i=0;i<c.length;i++)
	       {
	           System.out.print(c[i]+"  ");
	       }
	     }

}
