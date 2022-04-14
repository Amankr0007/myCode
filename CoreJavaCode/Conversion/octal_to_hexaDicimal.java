package conversion;
import java.util.*;
public class octal_to_hexaDicimal {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String octal=sc.next();//1D4C
		String hexachar="0123456789ABCDEFG";
		int i,p=0,dec=0,m;
		int l=octal.length();
		for(i=l-1;i>=0;i--)
		{
			char ch =octal.charAt(i);
			m=Character.getNumericValue(ch);
			dec = dec+m*(int)Math.pow(8,p);
			p++;
		}
		ArrayList<Integer> src = new ArrayList<Integer>();
		while(dec!=0)
		{
			m=dec%16;
			dec=dec/16;
			src.add(m);
		}
		int size= src.size();
		for(i=size-1;i>=0;i--)
		{
			m=src.get(i);
			if(m>9)
			{
				System.out.print((char)(55+m));
			}
			else
				System.out.print(m);
		}
	}

}

//456   1 0010 1110 = 12E



