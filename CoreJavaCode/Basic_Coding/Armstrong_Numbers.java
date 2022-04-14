package Basic_Coding;

import java.util.Scanner;
import java.math.*;

public class Armstrong_Numbers {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int low= sc.nextInt();
		int high=sc.nextInt();
		int flag=0;
		while(high>=low) {
		double num=low,digit=0,sum=0,count=0;
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		num=low;
		while(num!=0) {
			digit=num%10;
			num=num/10;
			double t=Math.pow(digit,count);
			sum=sum+t;
		}
		if(sum==low)
		{
			System.out.println("Armstrong no."+low);
			flag=1;
		}
		
		low++;
		}
		if(flag==0)
		{
			System.out.println("not armstrong");
		}
	}
}
