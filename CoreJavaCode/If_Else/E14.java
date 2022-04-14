/*
 * Write a java program to find the eligibility of admission for a professional 
 *course based on the following criteria:
Marks in Maths >=65
Marks in Phy >=55
Marks in Chem>=50
Total in all three subject >=190
or
Total in Math and Physics >=140
 */
package If_Else;
import java.util.*;
public class E14 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int maths=sc.nextInt();
		int phy=sc.nextInt();
		int chem=sc.nextInt();
	
			if(maths>=65 && phy>=55 && chem>=50 && ((maths+phy+chem)>=190 || (maths+phy)>=140))
			{
				System.out.println("Candidate is eligible");
			}
			
		else
		{
				System.out.println("Candidate is not eligible");
		}
	}

}

