package conversion;
import java.util.*;
public class Binary_to_Octal {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int Binary=sc.nextInt();
		int i,p=0,dec=0,m,n=Binary;
		while(n!=0)
		{
			m=n%10;
			dec=dec+m*(int)Math.pow(2,p);
			p++;
			n=n/10;
		}
		ArrayList<Integer> src = new ArrayList<Integer>();
		while(dec!=0)
		{
			m=dec%8;
			dec=dec/8;
			src.add(m);
		}
		int size=src.size();
		for(i=size-1;i>=0;i--)
		{
			System.out.print(src.get(i));
		}
	}

}
