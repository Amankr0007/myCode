package array_main;
import java.util.*;
public class A39 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		 int a[] = new int[n];
		 int shift=sc.nextInt();
	       int i,j;
	       for(i=0;i<n;i++)
	       {
	           a[i]=sc.nextInt();
	       }
	       for(j=1;j<=shift;j++) {
	       int x=a[0];
	       for(i=1;i<n;i++)//1 2 3 4 5
	       {
	    	   a[i-1]=a[i];   
	       }
	       a[n-1]=x;
	      
	       }
	       for(i=0;i<n;i++)
	       {
	    	   System.out.println(a[i]+" ");
	       }
	}

}
