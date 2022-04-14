package conversion;
import java.util.*;
public class hexa_to_decimal {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String hexa=sc.next();
		String hexachar="0123456789ABCDEF";
		int l=hexa.length();
		int i,p=0,dec=0,m;
		for(i=l-1;i>=0;i--)
		{
			char ch =hexa.charAt(i);
			m=hexachar.indexOf(ch);
			dec=dec + m*(int)Math.pow(16,p);
			p++;
		}
		System.out.print(dec);
		
	}
	

}
