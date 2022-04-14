package If_Else;
import java.util.*;
public class E2 {
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	int a=sc.nextInt();
	
	int b=sc.nextInt();
	
	int c=sc.nextInt();
	
	Greatestdisplay(a,b,c);
	Smallestdisplay(a,b,c);
	}
	static void Greatestdisplay(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println(" a is the greatest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(" b is the greatest number");
		}
		else if(c>b && c>a)
		{
			System.out.println(" c is the greatest number");
		}
	}
	static void Smallestdisplay(int a,int b,int c)
	{
		if(a<b && a<c)
		{
			System.out.println(" a is the smallest number");
		}
		else if(b<a && b<c)
		{
			System.out.println(" b is the smallest number");
		}
		else if(c<b && c<a)
		{
			System.out.println(" c is the smallest number");
		}
	}
}
