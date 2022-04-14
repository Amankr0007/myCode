package conversion;
import java.util.*;
public class Decimal_to_binary {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int dec=sc.nextInt();
		int r=0,n=dec,size;
		ArrayList<Integer> src = new ArrayList<Integer>();
		while(n!=0)
		{
			r=n%2;
			n=n/2;
			src.add(r);
		}
		 size =src.size();
		 for(int i=size-1;i>=0;i--)
		 {
			 System.out.print(src.get(i));
		 }
		
	}

}
