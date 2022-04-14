/*
 Write a C program to check whether the number of 3's is greater than the number of 5's.
 */
package Array;
import java.util.*;
public class A26 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
	int num_3=0,num_5=0;
	if(num_3==3)
	{
		num_3++;
	}
	else if(num_5==5)
	{
		num_5++;
	}
	if(num_3>num_5)
	{
		System.out.println(num_3);
	}
	}
	

}
