/*
 * Write a C program to read roll no, name and marks of three subjects and 
 * calculate the total, percentage and division.
 */
package If_Else;
import java.util.*;
public class E15 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Roll_no=");
		int roll_no=sc.nextInt();
		System.out.print("name=");
		String name= sc.next();
		int subject1=sc.nextInt();
		int subject2=sc.nextInt();
		int subject3=sc.nextInt();
		 int total=subject1+subject2+subject3;
		 System.out.println("total="+total);
		 double percentage=total/3;
		 System.out.println("percentage="+percentage);
		 if(percentage>=60)
		 {
			 System.out.println("first DIvision");
		 }
		 else if(percentage<60 && percentage>=48)
		 {
			System.out.println("second division"); 
		 }
		 else if(percentage<48 && percentage>=36)
		 {
			 System.out.println("third division");
		 }
		 else 
		 {
			 System.out.println("fail");
		 }
		 
	}

}
