package conversion;
import java.util.*;
public class binary_to_decimal_without_math_function {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int Binary=sc.nextInt();//10110
		int n=Binary,m,dec=0,power=1;
		/*while(n!=0)
		{
			m=n%10;
			dec=dec+m*power;
			n=n/10;
			power=power*2;
			
		}*/
		
		for(n=Binary;n!=0;n=n/10)//for(;n!=0;)
		{
			m=n%10;
			dec=dec+m*power;
			power=power*2;
		}
		System.out.println(dec);
	}

}
