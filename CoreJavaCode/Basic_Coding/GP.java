package Basic_Coding;
import java.util.*;
import java.math.*; 
public class GP {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();//number of terms
		int r=sc.nextInt();//
		int a=sc.nextInt();//starting term
		double term=1,i,sum=0,p;
		for(i=1;i<n;i++)
		{
			p=Math.pow(r,i-1);
			term=a*p;
			sum=sum+term;
			System.out.print(term+" ");
		}
		System.out.println("sum  :"+sum);
	}

}
