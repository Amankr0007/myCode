package Basic_Coding;
import java.util.*;
public class reverse_Digit {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int num=n,digit;
		while(num!=0)
		{
			digit=num%10;
			num=num/10;
			System.out.print(digit);
		}
				}

}
