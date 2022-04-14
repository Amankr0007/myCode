package conversion;

import java.util.ArrayList;
import java.util.Scanner;

public class Decimal_to_hexa {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int dec=sc.nextInt();
		int r=0,n=dec,size;
		ArrayList<Integer> src = new ArrayList<Integer>();
		while(n!=0)
		{
			r=n%16;
			n=n/16;
			src.add(r);
		}
		 size =src.size();
		 
		 for(int i=size-1;i>=0;i--)
		 {
			 r=src.get(i);
			 if(r>9)
			 {
				 System.out.print((char)(55+r));
			 }
			 else
			 {
				 System.out.print(src.get(i));
			 }
		 }
		
	}



}
