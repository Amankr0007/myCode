/*
 LCM using hcf method.
 */
 package Basic_Coding;
 

import java.util.Scanner;

public class LCM {
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
				hcf = i;
			}
			i++;
		}
		System.out.println("HCF =" +hcf);
		int LCM=(n1*n2)/hcf;
		System.out.println("LCM = "+ LCM);
		
	}


}
