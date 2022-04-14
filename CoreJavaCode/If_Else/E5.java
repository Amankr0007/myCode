/*Write a Java program that keeps a number from the user and generates an integer between
 *  1 and 7 and displays the name of the weekday.
 */
package If_Else;
import java.util.*;
public class E5 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		int day=sc.nextInt();
		if(day==1)
		{
			System.out.println("monday");
		}
		else if(day==2)
		{
			System.out.println("tuesday");
		}
		else if(day==3)
		{
			System.out.println("wednesday");
		}
		else if(day==4)
		{
			System.out.println("thrusday");
		}
		else if(day==5)
		{
			System.out.println("friday");
		}
		else if(day==6)
		{
			System.out.println("Saturday");
		}
		else if(day==7)
		{
			System.out.println("sunday");
		}
		else 
		{
			System.out.println("Error");
		}
		
	}

}
