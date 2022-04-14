/*
 *  Write a C program to check three given integers (small, medium and large) and return true 
 *  if the difference between small and medium and the difference between medium and large is same.
 */
package If_Else;

import java.util.Scanner;
import java.math.*;

public class E48 {


	 public static void main(String []args){
	      Scanner sc =new Scanner(System.in);
	      int small=sc.nextInt();
	      int medium=sc.nextInt();
	      int large=sc.nextInt();
	      int diff1=Math.abs(medium-small);
	      int diff2=Math.abs(large - medium);
	      if((diff1==diff2))
	      {
	    	  System.out.println("true");
	      }
	      else
	      {
	    	  System.out.println("false");
	      }
	 }
	 
}
