package Basic_Coding;
import java.util.*;
public class Strong_number {
		public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int digit,num=n,fact,sum=0;
		while(num!=0)
		{
			digit=num%10;
			num=num/10;
			fact=factorial(digit);
			sum=sum+fact;
		}
		if(sum==n)
		{
			System.out.println("Strong number "+ n);
		}
		else
		{
			System.out.println("not strong number");
		}
		}
		static int factorial(int n)
		{
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			return fact;
		}

}

		

