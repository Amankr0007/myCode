package Basic_Coding;
import java.util.*;
import java.math.*;
public class Quadratic_Equation {
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int dt=b*b-4*a*c;
			double rt=Math.sqrt(dt);
			if(dt==0)
			{
				double root=(-b)/2*a;
				System.out.println("root : "+ root);
			}
			else if(dt>0)
			{
				double root1=(((-b)-rt)/2*a);
				double root2=(((-b)+rt)/2*a);
				System.out.println("root1 : "+ root1+ "root2 : " + root2);
			}
			else 
			{
				System.out.println("roots are imaginary");
			}
			
		}
}
