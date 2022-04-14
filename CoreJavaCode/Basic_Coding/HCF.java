package Basic_Coding;
import java.util.*;
public class HCF {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int hcf=1,i=1;
		int min=(n1<n2)?n1:n2;
		while(i<=min)
		{
			if(n1%i==0 && n2%i==0)
			{
				hcf=i;
			}
			i++;
		}
		System.out.println("HCF =" +hcf);
		
	}

}
