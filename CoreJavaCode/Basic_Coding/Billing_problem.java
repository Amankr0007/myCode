/*
 Write a program in C to calculate and print the Electricity bill of a given customer. 
 The customer id., name and unit consumed by the user should be taken from the keyboard and 
 display the total amount to pay to the customer. The charge are as follow : Go to the editor

Unit	Charge/unit
upto 199	@1.20
200 and above but less than 400	@1.50
400 and above but less than 600	@1.80
600 and above	@2.00
If bill exceeds Rs. 400 then a surcharge of 15% will be charged and the minimum bill should be of Rs. 100/-

Test Data :
1001
James
800
Expected Output :
Customer IDNO :1001
Customer Name :James
unit Consumed :800
Amount Charges @Rs. 2.00 per unit : 1600.00
Surcharge Amount : 240.00
Net Amount Paid By the Customer : 1840.00
example--
0 1 2 3 4..........................199 200 201.............399 400 401 ..............599 600.......

|------------- 1.20 -----------------| |-------- 1.50 -------| |---------- 1.80 -------| |---- 2.00 --

bill<100 -->100 minimum
bill>400 bill= actual bill+actual bill*40%
 */
package Basic_Coding;
import java.util.*;
public class Billing_problem {
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Name : ");
			String name= sc.nextLine();
			System.out.print("Id : ");
			int id = sc.nextInt();
			System.out.print("unit :");
			int unit=sc.nextInt();
			double bill=0;
			if(unit>=199)
			{
				bill=unit*1.20;
			}
			else if(unit>=200 && unit<400)
			{
				bill=199*1.20+(unit-199)*1.50;
			}
			else if(unit>=400 && unit<600)
			{
				bill=199*1.20+200*1.50+(unit-399)*1.80;
			}
			else if(unit>=600)
			{
				bill=199*1.20+200*1.50+200*1.80+(unit-599)*2.00;
			}
			
			if(bill<100)
			{
				bill=100;
			}
			if(bill>400)
			{
				bill=bill+bill*0.4;
			}

			System.out.println(name);
			System.out.println(id);
			System.out.println(bill);
		}
}
