package conversion;
import java.util.*;
import java.lang.*;
public class decimal_to_octal_without_using_array {
	public static void main(String args[])
	{
   Scanner sc = new Scanner(System.in);
   int decimal=sc.nextInt();
   String s1="";
   int m,dec=0,n=decimal;
   while(n!=0)
   {
	   m=n%8;
	   s1=String.valueOf(m)+s1;
	   n=n/8;
   }
   System.out.println(s1);
}
}
// 25%8 3%1
// 31