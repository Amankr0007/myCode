package Basic_Coding;
import java.util.*;
public class array {
	static Scanner sc=new Scanner(System.in);
	 public static void main(String[] args) {
	        
	        System.out.println("enter array length:");
	        int n = sc.nextInt();// length
	        int a[]=new int[n];//array creation
	        a=setArray(a);
	        display(a);
	    }
	    static int[] setArray(int a[])
	    {
	       // Scanner sc=new Scanner(System.in);
	        int i;
	        for(i=0;i<a.length;i++)
	         a[i]=sc.nextInt();
	         return a;
	    }
	    static void display(int a[])
	    {
	        for(int i=0;i<a.length;i++)
	        System.out.print(a[i]+"  ");
	    }

}
