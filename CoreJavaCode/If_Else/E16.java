/*
 * Write a C program to read temperature in centigrade and display a suitable message according to temperature state below : Go to the editor
Temp < 0 then Freezing weather
Temp 0-10 then Very Cold weather
Temp 10-20 then Cold weather
Temp 20-30 then Normal in Temp
Temp 30-40 then Its Hot
Temp >=40 then Its Very Hot
Test Data :
42
Expected Output :
Its very hot.
 */
package If_Else;
import java.util.*;
public class E16 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double temp=sc.nextDouble();
		if(temp<0)
		{
			System.out.println("Freezing weather");
		}
		else if(temp>0 && temp<10)
		{
			System.out.println("Very Cold weather");
		}
		else if(temp>0 && temp<20)
		{
			System.out.println("Cold weather");
		}
		else if(temp>20 && temp<30)
		{
			System.out.println("Normal in Temp");
		}
		else if(temp>30 && temp<40)
		{
			System.out.println("Its hot");
		}
		else if(temp>=40)
		{
			System.out.println("Its very hot");
		}
		
		
		

}
	
}
