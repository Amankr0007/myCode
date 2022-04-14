package If_Else;
import java.util.*;
public class E17 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double angle1=sc.nextDouble();//80
		double angle2=sc.nextDouble();//50
		double angle3=sc.nextDouble();//50
		if((angle1+angle2+angle3)==180)
		{
			System.out.println("it is a triangle");
			if(angle1==angle2 && angle2==angle3)
			{
				System.out.println("equilateral triangle");
			}
			else if(angle1==angle2 || angle2==angle3 || angle3==angle1 )
			{
				System.out.println("isosceles triangle");
			}
			else if(angle1!=angle2 && angle2!=angle3 && angle1!=angle3)
			{
				System.out.println("Scalene triangle");
			}
		}
		else
		{
			System.out.print("This is not a triangle");
		}
		
		
	}

}
