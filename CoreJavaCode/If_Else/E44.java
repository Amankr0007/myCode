package If_Else;

import java.util.Scanner;

public class E44 {
	 public static void main(String []args){
	      Scanner sc =new Scanner(System.in);
	      int n=sc.nextInt();
	      int m=sc.nextInt();
	      int n1=n%10;
	      int m1=n/10;
	      int n2=m%10;
	      int m2=m/10;
	      
	    if((n>=10 && n<=99) && (m>=10 && m<=99)) {
	      if(n2==m1 || n1==m1 || n1==m2 || n2==m2)
	      {
	    	  System.out.println("Digit Common");
	    	  
	      }
	      else
	      {
	    	  System.out.println("uncommon Digit");
	      }
	 }
}
}
