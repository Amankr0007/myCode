package If_Else;
import java.util.*;
public class E21 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double cp=sc.nextDouble();
		double sp=sc.nextDouble();
		if(cp>sp)
		{
			System.out.println("loss="+(cp-sp));
		}
		else 
		{
			System.out.println("profit="+(sp-cp));
		}
	}

}
