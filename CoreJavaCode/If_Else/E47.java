/*
 Write a C program to check two given integers and return 
 the value whichever value is nearest to 13 without going over. Return 0 if both numbers go over.
 */
package If_Else;

import java.util.Scanner;

public class E47 {

	 public static void main(String []args){
	      Scanner sc =new Scanner(System.in);
	      int n=sc.nextInt();
	      int m=sc.nextInt();
	     
	      if(m>n && m<=13 && n<=13)
	      {
	    	  System.out.println(m);
	      }
	      else if(n>m && m<=13 && n<=13)
	      {
	    	  System.out.println(n);
	      }
	      else if((m<=13) )
	      {
	    	  System.out.println(m);
	      }
	      else if(n<=13)
	      {
	    	  System.out.println(n);
	      }
	      else if (m>13 && n>13)
	      {
	    	  System.out.println(0);
	      }
	      
	 }
	 

}
