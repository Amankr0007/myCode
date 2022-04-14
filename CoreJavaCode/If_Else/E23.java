package If_Else;
import java.util.*;
public class E23 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String grade=sc.next();
		char ch=grade.charAt(0);
		if(ch=='E')
		{
			System.out.println("Excellent");
		}
		else if(grade.equals("V"))
		{
			System.out.println("Very Good");
		}
		else if(grade.equals("G"))
		{
			System.out.println("Good");
		}
		else if(grade.equals("A"))
		{
			System.out.println("Average");
		}
		else if(grade.equals("F"))
		{
			System.out.println("Fail");
		}
	}

}
