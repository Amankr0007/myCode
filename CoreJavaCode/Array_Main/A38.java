package array_main;

import java.util.Scanner;

public class A38 {
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
	       for(i=0,j=0;i<n && j<m;k++)
	       {
	    	   if(a[i]<b[j])
	    	   {
	    		   c[k]=a[i];
	    		   i++;
	    	   }
	    	   else
	    	   {
	    		   c[k]=b[j];
	    		   j++;   
	    	   }
	       }
	       while(i<n)
	       {
	    	   c[k]=a[i];
	    	   i++;k++;
	       }
	       while(j<m)
	       {
	    	   c[k]=b[j];
	    	   j++;k++;
	       }
	       for(i=0;i<c.length;i++)
	       {
	    	   System.out.println(c[i]+" ");
	       }
	}

}
