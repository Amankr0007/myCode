package conversion;
import java.util.*;
public class Decimal_to_binary_without_array {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int decimal=sc.nextInt();
		String st="";
		int p=0,m,n=decimal;
		while(n!=0)
		{
			m=n%2;
			st=String.valueOf(m)+st;
			n=n/2;
		}
		System.out.println(st);
	}

}
