package If_Else;
import java.util.*;
public class E1 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number"+" ");
		int n=sc.nextInt();
		display(n);
		
		
	}
		static void display(int n)
		{
			if(n>=0)
			{
				System.out.print("positive");
			}
			else if(n<0)
			{
				System.out.print("negative");
			}
			
		}
}
