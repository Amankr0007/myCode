package Array;
import java.util.*;
public class Bubble_sort {
			public static void main(String args[])
			{
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int a[] = new int[n];
				for(int i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
				}
				bubbleSort(a);
				System.out.println();
				display(a);
				
			}
			static void bubbleSort(int a[])
			{
				int j,i,k;
				for(i=0;i<a.length-1;i++)
				{
					for(j=0;j<a.length-1-i;j++)
					{
						if(a[j]>a[j+1])
						{
							k=a[j];
							a[j]=a[j+1];
							a[j+1]=k;
							display(a);
						}
					}
					System.out.println();
					display(a);
				}
			}
			static void display(int a[])
			{
				System.out.println();
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i]+" ");
				}
			}
}
