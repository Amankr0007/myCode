package Basic_Coding;
import java.util.*;
public class Digit {
			public static void main(String args[])
				{
					Scanner sc = new Scanner(System.in);
					int n= sc.nextInt();
					int num=n,digit,sum=0,count=0;
					while(num!=0)
					{
						digit=num%10;
						num=num/10;
						sum=sum+digit;
						count++;
						
					}
					System.out.println(sum);
					System.out.println(count);
						
				}
}
