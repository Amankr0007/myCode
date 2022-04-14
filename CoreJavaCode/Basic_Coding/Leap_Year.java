package Basic_Coding;
import java.util.*;
public class Leap_Year {
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Year is leap year or not:");
			int n=sc.nextInt();
			
			if((n%400==0) || (n%100!=0 && n%4==0))
			{
				System.out.println("this is leap year");
			}
			else
			{
				System.out.println("this is not a leap year");
			}
					
		}
}
