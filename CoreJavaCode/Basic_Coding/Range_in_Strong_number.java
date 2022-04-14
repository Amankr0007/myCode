package Basic_Coding;
import java.util.Scanner;
public class Range_in_Strong_number {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int low= sc.nextInt();
	int high=sc.nextInt();
	int flag=0;
	while(high>=low)
	{
		int digit,num=low,fact,sum=0;
	while(num!=0)
	{
		digit=num%10;
		num=num/10;
		fact=factorial(digit);
		sum=sum+fact;
	}
	if(sum==low)
	{
		System.out.println("Strong number "+ low);
		flag=1;
	}
	low++;
	
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
