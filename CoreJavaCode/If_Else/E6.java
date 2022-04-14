/*Write a Java program that reads in two floating-point numbers and tests
whether they are the same up to three decimal places.
*/
package If_Else;
import java.util.*;
public class E6 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double n1= sc.nextDouble();
		double n2 = sc.nextDouble();
		n1=n1*1000;
		n2=n2*1000;
		int i1=(int)n1;
		int i2=(int)n2;
		if(i1==i2)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
	}

}
