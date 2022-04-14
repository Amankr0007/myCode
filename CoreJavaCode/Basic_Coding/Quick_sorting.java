package Basic_Coding;
import java.util.*;
public class Quick_sorting {
			public static void main(String args[])
			{
				Scanner sc = new Scanner(System.in);
				int n=sc.nextInt();
				int a[] = new int[n];
				for(int i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
				}
				
				Quicksort(a,0,n-1);
				display(a);
				
			}
			static void Quicksort(int a[],int low,int high)
			{
				if(low<high)
				{
					int p=partition(a,low,high);
					Quicksort(a,low,p-1);
					Quicksort(a,p+1,high);
					
				}
			}
			static int partition(int a[],int low ,int high)
			{
				int i,j=low-1,temp;
				int pivot=a[high];
				for(i=low;i<high;i++)
				{
					if(a[i]<=pivot)
					{
						j++;
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}	
				}
				temp=a[j+1];
				a[j+1]=a[high];
				a[high]=temp;
				return j+1;
			}
			static void display(int a[])
			{
				System.out.println();
				for(int i=0;i<a.length;i++)
				{
					System.out.println(a[i]+" ");
				}
			}
}
