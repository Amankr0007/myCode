package conversion;
import java.util.*;
public class Binary_to_decimal {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int binary=sc.nextInt();
		int i,dec=0,p=0,n=binary,m;
		while(n!=0)
		{
			m=n%10;
			dec=dec+m*(int)Math.pow(2,p);
			p++;
			n=n/10;
		}
		System.out.println(dec);
	}

}
