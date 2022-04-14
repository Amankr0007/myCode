package Basic_Coding;
import java.util.*;
public class AP {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();//number of terms
		int d=sc.nextInt();//common difference
		int a=sc.nextInt();//starting term
		int term,i,sum=0;
		for(i=1;i<n;i++)
		{
			term=a+(i-1)*d;
			sum=sum+term;
			System.out.print(term+" ");
			
			
			
		}
		
		System.out.println();
		System.out.println("sum :"+sum);
		
	}

}
