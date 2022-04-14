// Write a C program to check whether a given temperatures is less than 0 and the other is greater than 100.
package If_Else;
import java.util.*;
public class E25 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double temp1=sc.nextDouble();
		double temp2=sc.nextDouble();
		if((temp1<0 && temp2>100) ||(temp2<0 && temp1>100))
		{
			System.out.println("normal");
		}
		else
		{
			System.out.println("Abnormal");
		}
	}

}
