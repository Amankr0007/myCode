package conversion;
import java.util.*;
public class Octal_to_decimal {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int octal=sc.nextInt();
		int i,dec=0,p=0,m,n=octal;
		while(n!=0)
		{
			m=n%10;
			dec=dec+m*(int)Math.pow(8,p);
			p++;
			n=n/10;
		}
		System.out.print(dec);
	}

}
