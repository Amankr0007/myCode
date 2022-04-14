package Basic_Coding;

import java.util.Scanner;

public class LCM_without_hcf_method {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int max=(n1>n2)?n1:n2;
		int lcm=max;
		while(!(lcm%n1==0 && lcm%n2==0))
		{
			lcm=lcm+max;
		}
		System.out.println(lcm);
	}
}
