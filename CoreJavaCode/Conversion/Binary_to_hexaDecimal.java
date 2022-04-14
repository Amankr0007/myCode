//
package conversion;
import java.util.*;
public class Binary_to_hexaDecimal {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int binary=sc.nextInt();
		int i,dec=0,p=0,n=binary,m;
		//binary to decimal
		while(n!=0)
		{
			m=n%10;
			dec=dec+m*(int)Math.pow(2,p);
			p++;
			n=n/10;
		}
		//decimal to hexa
		ArrayList<Integer> hexa=new ArrayList();
		while(dec!=0)
		{
			m=dec%16;
			hexa.add(m);
			dec=dec/10;
		}
		for(i=hexa.size()-1;i>=0;i--)
		{
			m=hexa.get(i);
			if(m>9)
			{
				System.out.print((char)(55+m));
			}
			else
				System.out.print(m);
		}
		
	}

}

//binary to hexadecimal -- binary-->decimal-->hexadecimal
