package pattern;
import java.util.*;
public class p14pyramid {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int row = sc.nextInt();
	      patternMethod(row);
	    }
	    static void patternMethod(int row){
	    int i,sp,j;
	    for(i=1;i<=row;i++)
	    {
	        for(sp=1;sp<=row-i;sp++)
	        System.out.print(" ");
	        for(j=1;j<=i;j++)
	        {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    row=row-1;
	    for(i=1;i<=row;i++)
	    {
	        for(sp=1;sp<=i;sp++)
	        System.out.print(" ");
	        for(j=1;j<=row-i+1;j++)
	        {
	        System.out.print("* ");
	        }
	        System.out.println();
	    }
	        
	    }

}
