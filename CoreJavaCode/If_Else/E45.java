/*
Write a C program to compute the sum of the three integers. 
If one of the values is 13 then do not count it and its right towards the sum. 
*/
package If_Else;

import java.util.Scanner;

public class E45 {
	 public static void main(String []args){
	      Scanner sc =new Scanner(System.in);
	      int n=sc.nextInt();
	      int m=sc.nextInt();
	      int o=sc.nextInt();
	      int sum;
	      if(n!=13 && m!=13 && o!=13 )
	      {
	    	  sum=n+m+o;
	    	  System.out.println(sum);
	      }
	      else if(n==13)
	      {
	    	  System.out.println(0);
	      }
	      else if(m==13)
	      { 
	    	  System.out.println(n);
	      }
	      else if(o==13)
	      {
	    	  sum=m+n;
	    	  System.out.println(sum);
	      }
	 
	 }

}
