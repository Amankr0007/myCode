//Write a C program to check whether two or more non-negative given integers have the same rightmost digit.
package If_Else;

import java.util.Scanner;

public class E43 {
	 public static void main(String []args){
	      Scanner sc =new Scanner(System.in);
	      int n=sc.nextInt();
	      int m=sc.nextInt();
	      int o=sc.nextInt();
	      int n1=n%10;
	      int n2=m%10;
	      int n3=o%10;
	      if(n1==n2 ||n1==n3 ||n2==n3 ||(n1==n2 && n1==n3))
	      {
	    	  System.out.println("Didgit Common");
	    	  
	      }
	      else
	      {
	    	  System.out.println("uncommon Digit");
	      }
	 }
	 
}
