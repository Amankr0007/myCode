package Basic_Coding;
import java.util.*;
public class searching {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int val=sc.nextInt();
		int i,j,flag=0;
		for(i=0;i<n;i++)
		{
			if(a[i]==val)
			{
				System.out.println("found");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("not found");
		}
	}

}
