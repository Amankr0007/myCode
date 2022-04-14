package conversion;

import java.util.ArrayList;
import java.util.Scanner;

public class Decimal_to_octal {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int dec=sc.nextInt();
		int r=0,n=dec,size;
		ArrayList<Integer> src = new ArrayList<Integer>();
		while(n!=0)
		{
			r=n%8;
			n=n/8;
			src.add(r);
		}
		 size =src.size();
		 for(int i=size-1;i>=0;i--)
		 {
			 System.out.print(src.get(i));
		 }
		
	}



}
