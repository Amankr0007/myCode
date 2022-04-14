/*
 Write a C program to compute the sum of the three given integers. However, 
 if any of the values is in the range 10..20 inclusive then that value counts as 0, except 13 and 17.
 */
package If_Else;

import java.util.Scanner;

public class E46 {

	 public static void main(String []args){
	      Scanner sc =new Scanner(System.in);
	      int n=sc.nextInt();
	      int m=sc.nextInt();
	      int o=sc.nextInt();
	      int sum=0;
	      if((n>=10 && n<=20) && !(n==13 ||n==17))
	      {
	    	  n=0;
	      }
	      if((m>=10 && m<=20) && !(m==13 ||m==17))
	      {
	    	  m=0;
	      }	
	      if((o>=10 && o<=20) && !(o==13 ||o==17))
	      {
	    	o=0;
	      }
	      sum=m+n+o;
	      System.out.println("sum="+sum);
	 }
}
