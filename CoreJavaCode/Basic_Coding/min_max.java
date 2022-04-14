package Basic_Coding;
import java.util.*;
public class min_max {
	public static void main(String args[]) {
		
	
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	//max
	if(a>b && a>c)
	{
		System.out.println("max:"+a);
	}
	else if(b>a && b>c)
	{
		System.out.println("max:"+b);
	}
	else if(c>b &&c>a)
	{
		System.out.println("max:"+c);
	}
	//min
	if(a<b && a<c)
	{
		System.out.println("min:"+a);
	}
	else if(b<a && b<c)
	{
		System.out.println("min:"+b);
	}
	else if(c<b &&c<a)
	{
		System.out.println("min:"+c);
	}
	
	}

}

