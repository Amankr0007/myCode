package Basic_Coding;
import java.util.*;
public class Selection_sort {
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int a[]= new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			Selection_method(a);
			Display(a);
		}
		static void Selection_method(int a[])
		{
			int i,j,small=0,index=0;
			for(i=0;i<a.length-1;i++)
			{
				small=a[i];
				index=i;
				for(j=i+1;j<a.length;j++)
				{
					if(a[j]<small)
					{
						small=a[j];
						index=j;
					}
				}
				a[index]=a[i];
				a[i]=small;
			}
		}
		static void Display(int a[])
		{
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]+" ");
			}
		}
}
