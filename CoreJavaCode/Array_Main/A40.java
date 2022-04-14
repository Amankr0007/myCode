package array_main;

import java.util.Scanner;

public class A40 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		 int a[] = new int[n];
		 int celling=sc.nextInt();
	       int i=0;
	       for(i=0;i<n;i++)
	       {
	           a[i]=sc.nextInt();
	       }
	       i=0;
	       while(i<n &&  a[i]<celling)
	       {
	    	   i++;
	    	  // System.out.println(i);
	       }
	       if(i!=n)
	       {
	    	   System.out.println(a[i]);
	       }
	       else
	       {
	    	   System.out.println("-1");
	       }
	       
	}

}
