package conversion;
import java.util.*;
public class octal_to_binary {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int octal=sc.nextInt();
		int i,p=0,m,dec=0,n=octal;
		while(n!=0)
		{
			m=n%10;
			dec=dec+m*(int)Math.pow(8,p);
			p++;
			n=n/10;
		}
		System.out.println(dec);
		ArrayList<Integer> scr = new ArrayList<Integer>();
		while(dec!=0)
		{
			m=dec%2;
			dec=dec/2;
			scr.add(m);
		}
		int size =scr.size();
		for(i=size-1;i>=0;i--)
		{
			System.out.print(scr.get(i));
		}
	}
                 
}

/*
 				13
 				3*8^0+1*8^1=3+8=11
 				11%2=1
 				5%2=1
 				2%2=0
 				1%2=1    1011
 				
 
  */
