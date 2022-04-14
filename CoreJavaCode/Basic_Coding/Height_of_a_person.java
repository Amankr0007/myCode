package Basic_Coding;
import java.util.*;
public class Height_of_a_person {
			public static void main(String args[])
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("enter height of a person:");
				int h=sc.nextInt();
				if(h<150)
				{
					System.out.println("dwarf");
				}
				else if(150<=h && h<165)
				{
					System.out.println("avg height");
				}
				else if(h>=165)
				{
					System.out.print("tall");
				}
			}
			
}
