package conversion;
import java.util.*;
public class Hexa_to_binary {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String hexa=sc.next();
		String hexachar="0123456789ABCDEFG";
		int l=hexa.length();
		int i,p=0,dec=0,m;
		for(i=l-1;i>=0;i--)
		{
			char ch =hexa.charAt(i);
			m=hexachar.indexOf(ch);
			dec=dec+m*(int)Math.pow(16,p);
			p++;
		}
		ArrayList<Integer> src = new ArrayList<Integer>();
		while(dec!=0)
		{
			m=dec%2;
			dec=dec/2;
			src.add(m);
		}
		int size=src.size();
		for(i=size-1;i>=0;i--)
		{
			System.out.print(src.get(i));
		}
		
	}

}
