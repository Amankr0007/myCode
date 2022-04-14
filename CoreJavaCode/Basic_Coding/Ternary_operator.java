package Basic_Coding;
import java.util.*;
public class Ternary_operator {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		int max=(x>y)?x:y;
		max=(max>z)?max:z;
		System.out.println(max);
		
		max=( ((x>y)?x:y)>z)?((x>y)?x:y):z;
		System.out.println(max);
		
		int min=(x<y)?x:y;
		min=(min<z)?min:z;
		System.out.println(min);
		
		min=(((x<y)?x:y)<z)?((x<y)?x:y):z;
		System.out.println(min);
	}

}
