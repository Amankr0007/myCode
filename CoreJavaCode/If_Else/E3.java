/*
 * Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
 * Otherwise, print "positive" or "negative". Add "small" if the absolute
 *  value of the number is less than 1, or "large" if it exceeds 1,000,000.
 * */
package If_Else;
import java.util.*;
import java.math.*;
public class E3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number"+ " ");
		double d=sc.nextDouble();
		if(d==0)
		{
			System.out.print("zero"+" ");
		}
		else if(d>0)
		{
			System.out.println("positive"+ " ");
		}
		else if(d<0)
		{
			System.out.println("negative" + " ");
		}
		double ab=Math.abs(d);
		if(ab<1)
		{
			System.out.println("Small"+" ");
		}
		else if(ab>1000000)
		{
			System.out.println("Large"+ " ");
		}
	
		}

}
